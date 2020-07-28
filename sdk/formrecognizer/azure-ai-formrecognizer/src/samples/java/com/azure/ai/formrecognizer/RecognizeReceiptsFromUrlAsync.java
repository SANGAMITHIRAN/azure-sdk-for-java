// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer;

import com.azure.ai.formrecognizer.models.FieldValueType;
import com.azure.ai.formrecognizer.models.FormField;
import com.azure.ai.formrecognizer.models.OperationResult;
import com.azure.ai.formrecognizer.models.RecognizedForm;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.util.polling.PollerFlux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Async sample for recognizing commonly found US receipt fields from a file source URL. For a suggested approach to
 * extracting information from receipts, see StronglyTypedRecognizedForm.java.
 * See fields found on a receipt here:
 * https://aka.ms/formrecognizer/receiptfields
 */
public class RecognizeReceiptsFromUrlAsync {

    /**
     * Main method to invoke this demo.
     *
     * @param args Unused. Arguments to the program.
     */
    public static void main(final String[] args) {
        // Instantiate a client that will be used to call the service.
        FormRecognizerAsyncClient client = new FormRecognizerClientBuilder()
            .credential(new AzureKeyCredential("{key}"))
            .endpoint("https://{endpoint}.cognitiveservices.azure.com/")
            .buildAsyncClient();

        String receiptUrl = "https://raw.githubusercontent.com/Azure/azure-sdk-for-java/master/sdk/formrecognizer"
            + "/azure-ai-formrecognizer/src/samples/java/sample-forms/receipts/contoso-allinone.jpg";
        PollerFlux<OperationResult, List<RecognizedForm>> recognizeReceiptPoller =
            client.beginRecognizeReceiptsFromUrl(receiptUrl);

        Mono<List<RecognizedForm>> receiptPageResults = recognizeReceiptPoller
            .last()
            .flatMap(pollResponse -> {
                if (pollResponse.getStatus().isComplete()) {
                    System.out.println("Polling completed successfully");
                    // training completed successfully, retrieving final result.
                    return pollResponse.getFinalResult();
                } else {
                    return Mono.error(new RuntimeException("Polling completed unsuccessfully with status:"
                        + pollResponse.getStatus()));
                }
            });

        receiptPageResults.subscribe(recognizedReceipts -> {
            for (int i = 0; i < recognizedReceipts.size(); i++) {
                RecognizedForm recognizedForm = recognizedReceipts.get(i);
                Map<String, FormField> recognizedFields = recognizedForm.getFields();
                System.out.printf("----------- Recognized receipt for page %d -----------%n", i);
                FormField merchantNameField = recognizedFields.get("MerchantName");
                if (merchantNameField != null) {
                    if (FieldValueType.STRING == merchantNameField.getValue().getType()) {
                        String merchantName = merchantNameField.getValue().asString();
                        System.out.printf("Merchant Name: %s, confidence: %.2f%n",
                            merchantName, merchantNameField.getConfidence());
                    }
                }

                FormField merchantPhoneNumberField = recognizedFields.get("MerchantPhoneNumber");
                if (merchantPhoneNumberField != null) {
                    if (FieldValueType.PHONE_NUMBER == merchantPhoneNumberField.getValue().getType()) {
                        String merchantAddress = merchantPhoneNumberField.getValue().asPhoneNumber();
                        System.out.printf("Merchant Address: %s, confidence: %.2f%n",
                            merchantAddress, merchantPhoneNumberField.getConfidence());
                    }
                }

                FormField merchantAddressField = recognizedFields.get("MerchantAddress");
                if (merchantAddressField != null) {
                    if (FieldValueType.STRING == merchantAddressField.getValue().getType()) {
                        String merchantAddress = merchantAddressField.getValue().asString();
                        System.out.printf("Merchant Address: %s, confidence: %.2f%n",
                            merchantAddress, merchantAddressField.getConfidence());
                    }
                }

                FormField transactionDateField = recognizedFields.get("TransactionDate");
                if (transactionDateField != null) {
                    if (FieldValueType.DATE == transactionDateField.getValue().getType()) {
                        LocalDate transactionDate = transactionDateField.getValue().asDate();
                        System.out.printf("Transaction Date: %s, confidence: %.2f%n",
                            transactionDate, transactionDateField.getConfidence());
                    }
                }

                FormField receiptItemsField = recognizedFields.get("Items");
                if (receiptItemsField != null) {
                    System.out.printf("Receipt Items: %n");
                    if (FieldValueType.LIST == receiptItemsField.getValue().getType()) {
                        List<FormField> receiptItems = receiptItemsField.getValue().asList();
                        receiptItems.stream()
                            .filter(receiptItem -> FieldValueType.MAP == receiptItem.getValue().getType())
                            .map(formField -> formField.getValue().asMap())
                            .forEach(formFieldMap -> formFieldMap.forEach((key, formField) -> {
                                if ("Name".equals(key)) {
                                    if (FieldValueType.STRING == formField.getValue().getType()) {
                                        String name = formField.getValue().asString();
                                        System.out.printf("Name: %s, confidence: %.2fs%n",
                                            name, formField.getConfidence());
                                    }
                                }
                                if ("Quantity".equals(key)) {
                                    if (FieldValueType.DOUBLE == formField.getValue().getType()) {
                                        Double quantity = formField.getValue().asDouble();
                                        System.out.printf("Quantity: %f, confidence: %.2f%n",
                                            quantity, formField.getConfidence());
                                    }
                                }
                                if ("Price".equals(key)) {
                                    if (FieldValueType.DOUBLE == formField.getValue().getType()) {
                                        Double price = formField.getValue().asDouble();
                                        System.out.printf("Price: %f, confidence: %.2f%n",
                                            price, formField.getConfidence());
                                    }
                                }
                                if ("TotalPrice".equals(key)) {
                                    if (FieldValueType.DOUBLE == formField.getValue().getType()) {
                                        Double totalPrice = formField.getValue().asDouble();
                                        System.out.printf("Total Price: %f, confidence: %.2f%n",
                                            totalPrice, formField.getConfidence());
                                    }
                                }
                            }));
                    }
                }
            }
        });

        // The .subscribe() creation and assignment is not a blocking call. For the purpose of this example, we sleep
        // the thread so the program does not end before the send operation is complete. Using .block() instead of
        // .subscribe() will turn this into a synchronous call.
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

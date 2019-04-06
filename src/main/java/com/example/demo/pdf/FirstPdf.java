package com.example.demo.pdf;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class FirstPdf {
    private static String FILE = "D:/FirstPdf.pdf";

    private static Font bigBoldFont = new Font(Font.FontFamily.TIMES_ROMAN, 25,
            Font.BOLD);
    private static Font smallFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 13,
            Font.BOLD);
    private static Font bigBold = new Font(Font.FontFamily.TIMES_ROMAN, 18,
            Font.BOLD);
    private static Font font = new Font(Font.FontFamily.TIMES_ROMAN, 13,
            Font.NORMAL);

    public static void main(String[] args) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.open();
            addMetaData(document);
            addDayPage(document);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // iText allows to add metadata to the PDF which can be viewed in your Adobe
    // Reader
    // under File -> Properties
    private static void addMetaData(Document document) {
        document.addTitle("Training plan");
        document.addSubject("Using iText");
        document.addKeywords("plan, training");
    }

    private static void addDayPage(Document document) throws DocumentException, IOException {

        HashMap<String, String> exerciseList = new HashMap<>();
        exerciseList.put("Wyciskanie francuskie", "exercise1.png");
        exerciseList.put("Wyciskanie na kolanie", "exercise2.png");
        exerciseList.put("Prostowniki na lawce", "exercise3.png");
        exerciseList.put("Uginanie plecow ze sztanga", "exercise4.png");
        exerciseList.put("Lydki na maszynie", "exercise5.png");
        exerciseList.put("Rowerek stacjonarny", "exercise6.png");
        exerciseList.put("Bieznia", "exercise7.png");



//        personal data
        Paragraph createdFor = new Paragraph("");
        Chunk createdForClient = new Chunk("Stworzony dla: ", smallBold);
        Chunk client = new Chunk("Krzysztof Wowczuk", smallFont);


        Paragraph createdBy = new Paragraph("");
        Chunk createdByCreator = new Chunk("Stworzony przez: ", smallBold);
        Chunk creator = new Chunk("Adrian Wegrzyn", smallFont);

        createdFor.setAlignment(Element.ALIGN_RIGHT);
        createdBy.add(new Chunk(createdByCreator));
        createdBy.add(new Chunk(creator));
        createdFor.add(new Chunk(createdForClient));
        createdFor.add(new Chunk(client));
        PdfPTable personalDataTable = new PdfPTable(2);
        personalDataTable.getDefaultCell().setBorder(0);
        personalDataTable.setWidthPercentage(120);
        personalDataTable.setHorizontalAlignment(0);
        personalDataTable.addCell(createdBy);
        personalDataTable.addCell(createdFor);
        document.add(personalDataTable);
        document.add(Chunk.NEWLINE);


//        information
        Paragraph day = new Paragraph("Dzien 1", bigBoldFont);
        day.setAlignment(Element.ALIGN_CENTER);
        document.add(day);

        Paragraph plan = new Paragraph("");
        Chunk planChunk = new Chunk("Plan: ", smallBold);
        Chunk planNameChunk = new Chunk("Schudnij szybko", smallFont);
        plan.setAlignment(Element.ALIGN_CENTER);
        plan.add(new Chunk(planChunk));
        plan.add(new Chunk(planNameChunk));

        document.add(plan);
        document.add(Chunk.NEWLINE);


//        warn-up

        Paragraph warnUp = new Paragraph("Rozgrzewka", bigBold);
        warnUp.setSpacingAfter(10f);
        document.add(warnUp);
        PdfPTable table = new PdfPTable(2);
        Exercise warnUpExercise = new Exercise( "Rowerek stacjonarny", 10);
        addExercise(table, warnUpExercise, exerciseList);
        document.add(table);

// list of strength exercises
        Paragraph training = new Paragraph("Trening silowy", bigBold);
        training.setSpacingAfter(10f);
        document.add(training);
        PdfPTable trainingTable = new PdfPTable(4);

        ArrayList<Exercise> listStrengthExercises = new ArrayList<>();
        listStrengthExercises.add(new Exercise( "Wyciskanie francuskie", 4, "8-12"));
        listStrengthExercises.add(new Exercise( "Wyciskanie na kolanie", 3, "8-10"));
        listStrengthExercises.add(new Exercise( "Prostowniki na lawce", 5, "8-12"));
        listStrengthExercises.add(new Exercise( "Uginanie plecow ze sztanga", 4, "8-12"));
        listStrengthExercises.add(new Exercise( "Lydki na maszynie", 2, "8-10"));
        listStrengthExercises.add(new Exercise( "Wyciskanie francuskie", 4, "8-12"));
        listStrengthExercises.add(new Exercise( "Prostowniki na lawce", 5, "8-12"));
        listStrengthExercises.add(new Exercise( "Prostowniki na lawce", 5, "8-12"));
        listStrengthExercises.add(new Exercise( "Prostowniki na lawce", 5, "8-12"));
        listStrengthExercises.add(new Exercise( "Prostowniki na lawce", 5, "8-12"));

        addExercise(trainingTable, listStrengthExercises, exerciseList);
        document.add(trainingTable);

        //    cardio
        Paragraph cardio = new Paragraph("Cardio", bigBold);
        cardio.setSpacingAfter(10f);
        document.add(cardio);
        PdfPTable cardioTable = new PdfPTable(2);

        Exercise cardioExercise = new Exercise( "Bieznia", 15);
        addExercise(cardioTable, cardioExercise, exerciseList);



        document.add(cardioTable);

    }

    private static void addExercise(PdfPTable pdfPTable, ArrayList<Exercise> list, HashMap<String, String> mapList) throws IOException, BadElementException {
        pdfPTable.getDefaultCell().setBorder(0);
        pdfPTable.setWidthPercentage(100);
        pdfPTable.setHorizontalAlignment(0);



        for (Exercise x : list) {
            String imgName = mapList.get(x.getName());
            Image img = Image.getInstance("src/main/java/com/example/demo/pdf/img/" + imgName);
            img.scaleToFit(100f, 100f);
            pdfPTable.addCell(img);

            Paragraph descriptionExercise = new Paragraph("");
            descriptionExercise.add(new Chunk(x.getName(), font).setUnderline(-.1f, -2f));
            descriptionExercise.add(new Chunk(Chunk.NEWLINE));
            descriptionExercise.add(new Chunk(x.getName()).getTextExpansion());
            descriptionExercise.add(new Chunk(Chunk.NEWLINE));
            descriptionExercise.add(new Chunk("Serie: ", smallBold));
            descriptionExercise.add(new Chunk(String.valueOf(x.getNumberSeries()), smallFont));
            descriptionExercise.add(new Chunk(Chunk.NEWLINE));
            descriptionExercise.add(new Chunk("Powtorzenia: ", smallBold));
            descriptionExercise.add(new Chunk( x.getRepeats(), smallFont));
            pdfPTable.addCell(descriptionExercise);
        }
        if(list.size() % 2 != 0){
            list.add(new Exercise());
            Paragraph descriptionExercise = new Paragraph("");
            pdfPTable.addCell(descriptionExercise);
            pdfPTable.addCell(descriptionExercise);
        }
        pdfPTable.setSpacingAfter(20f);
    }

    private static void addExercise(PdfPTable pdfPTable, Exercise exercise, HashMap<String, String> mapList) throws IOException, BadElementException {
        String imgName = mapList.get(exercise.getName());
        Image img = Image.getInstance("src/main/java/com/example/demo/pdf/img/" + imgName);
        img.scaleToFit(100f, 100f);
        Paragraph warnUpDescription = new Paragraph("");
        warnUpDescription.add(new Chunk(exercise.getName(), font).setUnderline(.1f, -2f));
        warnUpDescription.add(new Chunk(Chunk.NEWLINE));
        warnUpDescription.add(new Chunk(Chunk.NEWLINE));
        warnUpDescription.add(new Chunk("Czas: ", smallBold));
        warnUpDescription.add(new Chunk(exercise.getTime() + " min", smallFont));

        pdfPTable.getDefaultCell().setBorder(0);
        pdfPTable.setWidthPercentage(50);
        pdfPTable.setHorizontalAlignment(0);

        pdfPTable.addCell(img);
        pdfPTable.addCell(warnUpDescription);
    }
}
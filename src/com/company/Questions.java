package com.company;

public class Questions {

    /**
     * toDO:
     * Frage erstellen
     * Fragen dürfen nur einmal Angezeigt werden - heißt das doppelte Anfragen erstellen als gespielt wird
     * Mehrere Antwort möglichkeiten
     * Punkte pro richtige Frage || Punkt abzug für falsche ? - oder Game over ?
     * Highscore
     * Zeitlimit ? - wenn ja.....weniger Punkte je abgelaufener Zeit
     * Wenn frage beantwortet eine Runde weiter für schleife
     * 50/50 Joker?
     */

        String question1 ,question2, question3,question4,question5,question6,question7,question8,question9,question10;
        String[] answer1 = {"1812","1921","1922","!1912"};


        public Questions() {

            // 10 out of 30 Questions. Answere not Implemented yet
            question1 = "In welchem Jahr ist die Titanic am 15. April auf ihrer Jungfernfahrt von Southampton im Atlantik gesunken?";

            question2 = "Wie heißt das größte Technologieunternehmen in Südkorea?";
            String[] answer2 = {"!Samsung", "LG", "Nintendo", "SAP"};

            question3 = "Was ist die Hauptstadt von Portugal?";
            String[] answer3 = {"!Porto", "Faro","Lissabon","Lagos"};

            question4 = "Was ist die Puppe, Barbies, vollständiger Name?";
            String[] answer4 = {"!Barbara Millicent Roberts","Percy Barbant Shawn","Barbi","Barbie"};

            question5 = "Im welchen Jahr wurde The Godfather zum ersten mal Veröffentlicht";
            String[] answer5 = {"1932","1922","1951","!1972"};

            question6 = "Im welchem Jahr wurde das Produkt WD40 vom Chemiker Norm Larsen erfunden?";
            String[] answer6 = {"!1953","1899","1906","2004"};

            question7 = "Wie viele Haare hat ein typischer menschlicher Kopf auf die nächsten tausend?";
            String[] answer7 = {"1.000.000","!10.000","1000","10.000.000"};

            question8 = "Wie viel Wasser gibt es auf der Erde pro Mensch?";
            String[] answer8 = {"!210.000.000.000 l","10.000.000 l","2 l"," 1.000.000.000 l"};

            question9 = "Wo wurden die ersten Computeranimationen produziert?";
            String[] answer9 = {"MIT", "Standfort","Pixar","!Rutherford Appleton Laboratory"};

            question10 = "Wie heißt Adeles erste Platte?";
            String[] answer10 = {"!Glanz der Heimatstadt", "Gester","I dont know","27"};

        }

    }

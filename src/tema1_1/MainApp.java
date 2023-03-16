package tema1_1;

import tema1_1.clase.Copiatoare;
import tema1_1.clase.Echimpament;
import tema1_1.clase.Imprimante;
import tema1_1.clase.SistemeDeCalcul;
import tema1_1.enumerari.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("echipamente.txt")));
        String []db = new String[9];
        String line;
        String opt, nouaStare;
        int optiune, i;
        Scanner scanner = new Scanner(System.in);

        Situatie situatie = Situatie.EXPUS;
        List<Echimpament> list = new ArrayList<Echimpament>();

        while((line = reader.readLine())!=null){

        db = line.split(";");
        opt = db[5];

            if(db[4].equals("achizitionat")){
                situatie = Situatie.ACHIZITIONAT;
            }
            if(db[4].equals("vandut")){
                situatie = Situatie.VANDUT;
            }
            if(db[4].equals("expus")){
                situatie = Situatie.EXPUS;
            }

        if(db[5].equals("sistem de calcul")){


            SistemeDeCalcul s = new SistemeDeCalcul(db[0], Integer.parseInt(db[1]), Float.parseFloat(db[2]), db[3], situatie, Tipuri.SISTEM_DE_CALCUL, db[6], Float.parseFloat(db[7]), Integer.parseInt(db[8]), SistemDeOperare.valueOf(db[9].toUpperCase()));
            list.add(s);
        }

        if(db[5].equals("imprimanta")){

            Imprimante ii = new Imprimante(db[0], Integer.parseInt(db[1]), Float.parseFloat(db[2]), db[3], situatie, Tipuri.IMPRIMANTA, Integer.parseInt(db[6]), db[7], Integer.parseInt(db[8]), ModDeTiparire.valueOf(db[9].toUpperCase()));
            list.add(ii);
        }

        if(db[5].equals("copiator")){

            Copiatoare c = new Copiatoare(db[0], Integer.parseInt(db[1]), Float.parseFloat(db[2]), db[3], situatie, Tipuri.COPIATOR, Integer.parseInt(db[6]), FormatDeCopiere.valueOf(db[7].toUpperCase()));
            list.add(c);
        }

        }

/*        for(i =0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }*/

        for(Echimpament e: list){
            System.out.println(e);
        }
        for(Echimpament e: list){
            if(e instanceof Imprimante){
                System.out.println("\n"+e);

            }
        }

        for(Echimpament e: list){
            if(e instanceof Copiatoare){
                System.out.println("\n"+e);

            }
        }

        for(Echimpament e: list){
            if(e instanceof SistemeDeCalcul){
                System.out.println("\n"+e);

            }
        }

       /* do{
            System.out.println("---Meniu---");
            System.out.println("0.Iesire.");
            System.out.println("1.Afişarea tuturor echipamentelor\n" +
                    "•2. Afişarea imprimantelor\n" +
                    "•3. Afişarea copiatoarelor\n" +
                    "•4. Afişarea sistemelor de calcul\n" +
                    "•5. Modificarea stării în care se află un echipament\n" +
                    "•6. Setarea unui anumit mod de scriere pentru o imprimantă\n" +
                    "•7. Setarea unui format de copiere pentru copiatoare\n" +
                    "•8. Instalarea unui anumit sistem de operare pe un sistem de calcul\n" +
                    "•9. Afişarea echipamentelor vândute\n" +
                    "•10. Să se realizeze două metode statice pentru serializarea / deserializarea colecției de\n" +
                    "obiecte în fișierul echip.bin ");
            System.out.println("Dati optiunea: ");
            optiune = scanner.nextInt();

            switch (optiune){
                default:
                    System.out.println("Optiunea data nu exista.");
                case 0: System.exit(0);
                break;
                case 1: for(Echimpament e: list){
                    System.out.println(e);
                    break;
                }
                case 2: for(Echimpament e: list){
                    if(e instanceof Imprimante){
                        System.out.println(e);
                    }
                    break;
                }
                case 3: for(Echimpament e: list){
                    if(e instanceof Copiatoare){
                        System.out.println(e);
                    }
                    break;
                }
                case 4: for(Echimpament e: list){
                    if(e instanceof SistemeDeCalcul){
                        System.out.println(e);
                    }
                    break;
                }
                case 5:
                    *//*System.out.println("Dati numele echipamentului pentru schimbare de stare: ");
                    String nume = scanner.next();

                    for(i =0;i<list.size();i++){
                        if(list.get(i).getSit().equals(nume)){
                            do {
                                System.out.println("---STARI---\n" +
                                        "ACHIZITIONAT\n" +
                                        "EXPUS\n" +
                                        "VANDUT\n" +
                                        "Dati noua stare a obiectului: ");
                                nouaStare = scanner.next().toUpperCase();
                            }while(!(nouaStare.toUpperCase()=="ACHIZITIONAT"||nouaStare.toUpperCase()=="EXPUS"||nouaStare.toUpperCase()=="VANDUT"));
                            list.get(i).setSit(Situatie.valueOf(nouaStare));
                        }
                    }
                    break;*//*
            }

        }while(true);*/

    }
}

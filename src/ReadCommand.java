void main() {
    Scanner sc;
    sc = new Scanner(System.in);
    String rad;
    CountRowsAndChars resultat = new CountRowsAndChars();

    IO.println("Skriv text och avsluta med stop: ");

    while (resultat.inteStop) {
        rad = sc.nextLine();
        resultat.count(rad);
    }
    IO.println("Rader: " + resultat.radAnt + " Ord: " + resultat.ordAnt + " Tecken: " + resultat.teckAnt + " Längsta ord: " + resultat.longestWord);


}

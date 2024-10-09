package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {




    private Book[] books;
    private Scanner scanner;

    public NeighborhoodLibrary() {
        scanner = new Scanner(System.in);
        books = new Book[20];
        initializeBooks();
    }

    private void initializeBooks() {
        books[0] = new Book(101121, "978-1-23456-789-0", "Silent Echoes");
        books[1] = new Book(101122, "978-0-98765-432-1", "Whispers in the Wind");
        books[2] = new Book(101123, "978-1-54321-098-7", "Beneath the Stars");
        books[3] = new Book(101124, "978-3-12345-678-9", "The Midnight Dreamer");
        books[4] = new Book(101125, "978-1-67890-123-4", "Labyrinth of Time");
        books[5] = new Book(101126, "978-0-56789-234-5", "The Lost Symphony");
        books[6] = new Book(101127, "978-1-23490-567-8", "Echoes of Eternity");
        books[7] = new Book(101128, "978-2-34567-890-1", "The Last Ember");
        books[8] = new Book(101129, "978-0-98765-432-0", "Whispers of the Past");
        books[9] = new Book(101130, "978-1-23456-789-2", "Moonlit Pathways");
        books[10] = new Book(101131, "978-3-12345-678-0", "The Alchemist's Secret");
        books[11] = new Book(101132, "978-2-67890-123-4", "Into the Abyss");
        books[12] = new Book(101133, "978-0-54321-098-6", "Frostbitten Souls");
        books[13] = new Book(101134, "978-1-23456-789-3", "Shattered Dreams");
        books[14] = new Book(101135, "978-0-98765-432-2", "Veil of Darkness");
        books[15] = new Book(101136, "978-1-54321-098-5", "The Crystal Garden");
        books[16] = new Book(101137, "978-3-12345-678-1", "A Dance with Shadows");
        books[17] = new Book(101138, "978-0-56789-234-4", "Stolen Memories");
        books[18] = new Book(101139, "978-2-34567-890-2", "The Edge of Forever");
        books[19] = new Book(101140, "978-1-67890-123-5", "Winds of Fate");
    }


    }


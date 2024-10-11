package com.pluralsight;

public class NeighborhoodLibrary {


    private Book[] books;

    public NeighborhoodLibrary() {
        books = new Book[20];
    }


    private void initializeBooks() {
        books[0] = new Book(1, "978-1-23456-789-0", "Silent Echoes");
        books[1] = new Book(2, "978-0-98765-432-1", "Whispers in the Wind");
        books[2] = new Book(3, "978-1-54321-098-7", "Beneath the Stars");
        books[3] = new Book(4, "978-3-12345-678-9", "The Midnight Dreamer");
        books[4] = new Book(5, "978-1-67890-123-4", "Labyrinth of Time");
        books[5] = new Book(6, "978-0-56789-234-5", "The Lost Symphony");
        books[6] = new Book(7, "978-1-23490-567-8", "Echoes of Eternity");
        books[7] = new Book(8, "978-2-34567-890-1", "The Last Ember");
        books[8] = new Book(9, "978-0-98765-432-0", "Whispers of the Past");
        books[9] = new Book(10, "978-1-23456-789-2", "Moonlit Pathways");
        books[10] = new Book(11, "978-3-12345-678-0", "The Alchemist's Secret");
        books[11] = new Book(12, "978-2-67890-123-4", "Into the Abyss");
        books[12] = new Book(13, "978-0-54321-098-6", "Frostbitten Souls");
        books[13] = new Book(14, "978-1-23456-789-3", "Shattered Dreams");
        books[14] = new Book(15, "978-0-98765-432-2", "Veil of Darkness");
        books[15] = new Book(16, "978-1-54321-098-5", "The Crystal Garden");
        books[16] = new Book(17, "978-3-12345-678-1", "A Dance with Shadows");
        books[17] = new Book(18, "978-0-56789-234-4", "Stolen Memories");
        books[18] = new Book(19, "978-2-34567-890-2", "The Edge of Forever");
        books[19] = new Book(20, "978-1-67890-123-5", "Winds of Fate");
    }


    }
}
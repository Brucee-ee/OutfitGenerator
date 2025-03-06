# Outfit Generator

A fun little Java app that randomly picks outfits for you! Can't decide what to wear? Let this app do the work.

---

## How to Use

1. Make sure you have Java installed.
2. Download or clone this project.
3. Add your own images of t-shirts, trousers, and shoes to the `images` folder.
4. Run the program:
   - Open a terminal in the `src` folder.
   - Compile: `javac OutfitGenerator.java`
   - Run: `java OutfitGenerator`
5. Click the **Generate** button to get a random outfit!

---

## Customization

- Add more images to the `images` folder.
- Update the `tshirts`, `trousers`, and `shoes` arrays in the `OutfitGenerator.java` file to include your new images.

Example:

```java
private String[] tshirts = {
    "images/tshirt1.png",
    "images/tshirt2.png",
    "images/tshirt3.png" // Add more here
};

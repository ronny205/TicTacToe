# 🎮 Tic Tac Toe Game in Java

A simple console-based **Tic Tac Toe** game for two players (X and O), built using Java. This program lets two users play a turn-based game in the terminal and checks for wins or draws after every move.

---

## 🧩 Features

- 3x3 board printed in the console.
- Two-player turn-based gameplay.
- Validates user input and handles invalid or duplicate entries.
- Declares a winner or a draw at the end of the game.

---

## 🛠️ Requirements

- Java 8 or higher
- Terminal or IDE (like IntelliJ, Eclipse, etc.)

---

## 🚀 How to Run

1. **Clone or Download** the repository.

2. **Navigate** to the project directory.

3. **Compile the code:**

   ```bash
   javac Board.java
   ```

````

4. **Run the program:**

   ```bash
   java com.ronnie.Board
   ```

---

## 🕹️ How to Play

* The game starts with **Player X**.

* Players take turns by entering a number (1–9) corresponding to a board slot.

* The slot positions are laid out as:

  ```
  | 1 | 2 | 3 |
  | 4 | 5 | 6 |
  | 7 | 8 | 9 |
  ```

* If a player enters an invalid input (e.g., non-number, out-of-range, or already occupied), the program will ask for a re-entry.

* The game ends when one player wins or the board is full (draw).

---

## 📄 Example Gameplay

```
Welcome to 3x3 Tic Tac Toe.
|---|---|---|
| 1 | 2 | 3 |
|-----------|
| 4 | 5 | 6 |
|-----------|
| 7 | 8 | 9 |
|---|---|---|
X will play First. Enter a slot number to place X in:
> 1
... (game continues)
Congratulations! X's have won! Thanks for playing.
```

---

## 📂 Project Structure

```
src/
└── com/
    └── ronnie/
        └── Board.java
```

---

## ✍️ Author

Developed by **Ronnie**.

---

## 📝 License

This project is open-source and available for educational or personal use. Feel free to modify and distribute it.

````

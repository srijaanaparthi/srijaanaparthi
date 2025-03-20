const symbols = ["🍎", "🍌", "🍇", "🍉", "🍓", "🥭", "🍍", "🥝"];
let cards = [...symbols, ...symbols]; // Duplicate for pairs
cards.sort(() => Math.random() - 0.5); // Shuffle the cards

const gameBoard = document.getElementById("gameBoard");
let firstCard = null;
let secondCard = null;
let lockBoard = false;
let matches = 0;

// Create card elements
cards.forEach((symbol) => {
    const card = document.createElement("div");
    card.classList.add("card");
    card.dataset.symbol = symbol;
    card.addEventListener("click", flipCard);
    gameBoard.appendChild(card);
});

function flipCard() {
    if (lockBoard) return;
    if (this === firstCard) return;

    this.textContent = this.dataset.symbol;
    this.classList.add("flipped");

    if (!firstCard) {
        firstCard = this;
        return;
    }

    secondCard = this;
    lockBoard = true;

    checkForMatch();
}

function checkForMatch() {
    if (firstCard.dataset.symbol === secondCard.dataset.symbol) {
        firstCard.classList.add("matched");
        secondCard.classList.add("matched");
        resetBoard(true);
    } else {
        setTimeout(() => {
            firstCard.textContent = "";
            secondCard.textContent = "";
            firstCard.classList.remove("flipped");
            secondCard.classList.remove("flipped");
            resetBoard(false);
        }, 1000);
    }
}

function resetBoard(matched) {
    if (matched) {
        matches++;
        if (matches === symbols.length) {
            setTimeout(() => alert("Congratulations! You won!"), 500);
        }
    }
    firstCard = null;
    secondCard = null;
    lockBoard = false;
}
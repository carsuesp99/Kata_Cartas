const { it, expect } = require("@jest/globals");
const Cards = require('./cards');

describe('Test cards game', () =>{


    it('If card1 is higher, player1 should win', () =>{
        const cards = new Cards();
        const resultado = cards.whoWins(['2'], ['1']);
        expect(resultado).toBe("Player 1 wins. 1 - 0");
    })

    it('If card2 is higher, player2 should win', () => {
        const cards = new Cards();
        const resultado = cards.whoWins(['1'], ['2']);
        expect(resultado).toBe("Player 2 wins. 0 - 1");
    })

    it('If both cards have same value, should return tie', () =>{
        const cards = new Cards();
        const resultado = cards.whoWins(['4'], ['4']);
        expect(resultado).toBe("Tie. 0 - 0");
    })

    it('Card ranking not matches ascii order', () =>{
        const cards = new Cards();
        const resultado = cards.whoWins(['K'], ['J']);
        expect(resultado).toBe("Player 1 wins. 1 - 0");
    })

    it('More than one card', () =>{
        const cards = new Cards();
        var resultado = cards.whoWins(['K'], ['T']);
        expect(resultado).toBe("Player 1 wins. 1 - 0");
        resultado = cards.whoWins(['K'], ['Q']);
        expect(resultado).toBe("Player 1 wins. 2 - 0");
    })

})
package Blackjack_Commands

//******* DECK *******
object Deck {
	var deck = List("AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "KC", "AD", "2D", "3D", "4D",
					"5D", "6D", "7D", "9D", "10D", "JD", "QD", "KD", "AH", "2H", "3H", "5H", "6H", "7H", "8H",
					"10H", "JH", "QH", "KH", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "KS")
	def drawCard: String = {
		val drawnCard = deck.head
		deck = deck.tail
		drawnCard
	}
}
#include <stdio.h>
#include <string.h>
int main() {
	int king=1, queen=1, rook=2, bishoop=2, knight=2, pawn=8;
	int kings, queens, rooks, bishoops, knights, pawns;
	scanf("%d %d %d %d %d %d", &kings, &queens, &rooks, &bishoops, &knights, &pawns);
	printf("%d %d %d %d %d %d", king - kings, queen - queens, rook - rooks, bishoop - bishoops, knight - knights, pawn - pawns);
}
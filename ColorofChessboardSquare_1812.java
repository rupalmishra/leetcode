class ColorofChessboardSquare_1812 {
        public boolean squareIsWhite(String coordinates) {
            char column = coordinates.charAt(0); 
            char row = coordinates.charAt(1);    
            
            return (column + row) % 2 != 0;
        }
}


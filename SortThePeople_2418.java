class J {
    public String[] sortPeople(String[] names, int[] heights) {
        String[][] people = new String[heights.length][2];
        
        for (int i = 0; i < heights.length; i++) {
            people[i][0] = Integer.toString(heights[i]);
            people[i][1] = names[i];
        }
               
        Arrays.sort(people, (a, b) -> Integer.parseInt(b[0]) - Integer.parseInt(a[0]));

        String[] sortedNames = new String[names.length];
        for (int i = 0; i < people.length; i++) {
            sortedNames[i] = people[i][1];
        }
        
        return sortedNames;
    }
}
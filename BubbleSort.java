    //Bubble Sort -Array List
    static List<Integer> bubbleSort(List<Integer> arr) {
        for (int i = arr.size(); i > 0; i--) {
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j + 1) < arr.get(j)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }

            }

            System.out.println(arr.toString());
        }

        return arr;
    }

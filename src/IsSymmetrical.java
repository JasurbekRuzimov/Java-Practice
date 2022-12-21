public class IsSymmetrical {

    public static boolean isSymmetrical(String inputText) {
        if (inputText.length() == 0 || inputText.length() == 1)
            return true;

        if (inputText.charAt(0) == inputText.charAt(inputText.length() - 1))
            return isSymmetrical(inputText.substring(1, inputText.length() - 1));

        return false;
    }

    public static void main(String[] args) {
        String[] sampleData = {
                "kiyik","alla","bozor","text"
        };

        for (String s : sampleData) {
            System.out.println(" (" + s + ") " + isSymmetrical(s));
        }
    }
}
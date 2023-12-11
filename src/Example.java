import java.util.Scanner;

class Example {
    static Scanner input = new Scanner(System.in);

    static String username = "Samadara";
    static String password = "1234";

    private static void loadLoginPage() {
        System.out.println("+---------------------------------------------------------------------------+");
        System.out.println("|                                LOGIN PAGE                                 |");
        System.out.println("+---------------------------------------------------------------------------+");

        System.out.print("User Name : ");
        String inputted_username = input.next();

        String inputted_password = null;

        while (!inputted_username.equals(username)) {
            System.out.println("User name invalid. please try again!");
            System.out.print("\nUser Name : ");
            inputted_username = input.next();
        }

        System.out.print("Password : ");
        inputted_password = input.next();

        while (!inputted_password.equals(password)) {
            System.out.println("Password is incorrect. please try again!");
            System.out.print("\nPassword : ");
            inputted_password = input.next();
        }



    }

    public static void animation() {
/* System.out.println("\n\n\n\n\n\t\t\t\tLoading\n\n\n\n");
for(int i = 0 ; i < 15 ; i++){
System.out.print("***");
try{Thread.sleep(100);}catch(Exception ex){}
System.out.print("\b "+"\b\b ");
System.out.print(" ");
}*/
    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c",
                        "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    public static void topic() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
            try {
                Thread.sleep(10);
            } catch (Exception ex) {
            }
        }
        System.out.print("\b " + "\b\b " + "\b\b ");
        System.out.println("\n|\t\t\t\tWELCOME TO GDSE MARKS MANAGEMENT SYSTEM\t\t\t\t|");
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
            try {
                Thread.sleep(10);
            } catch (Exception ex) {
            }
        }
        System.out.print("\b " + "\b\b " + "\b\b ");
    }

    public static void help() {
        System.out.println("\n\n[1] Add New Student\t\t\t\t\t[2] Add New Student With Marks");
        try {
            Thread.sleep(10);
        } catch (Exception ex) {
        }
        System.out.println("[3] Add Marks \t\t\t\t\t\t[4] Update Student Details");
        try {
            Thread.sleep(10);
        } catch (Exception ex) {
        }
        System.out.println("[5] Update Marks \t\t\t\t\t[6] Delete Student");
        try {
            Thread.sleep(10);
        } catch (Exception ex) {
        }
        System.out.println("[7] Print Student Details\t\t\t[8] Print Student Rank");
        try {
            Thread.sleep(10);
        } catch (Exception ex) {
        }
        System.out.println("[9] Best In Program Fundamentals\t[10] Best In Database Management System");
        try {
            Thread.sleep(10);
        } catch (Exception ex) {
        }
        System.out.println("\n[exit] Exit From The Program\n");
    }

    public static boolean isExists(String s, String[][] st) {
        for (int i = 0; i < st[0].length; i++) {
            if (s.equals(st[0][i])) {
                return true;
            }
        }
        return false;
    }

    public static String[][] addStudents(String[][] s) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nInput Student ID : ");
        String x = input.next();
        if (!isExists(x, s)) {
            System.out.print("Input Name Of The Student : ");
            String y = input.next();
            String temp[][] = new String[2][s[0].length + 1];
            for (int i = 0; i < s[0].length; i++) {
                temp[0][i] = s[0][i];
                temp[1][i] = s[1][i];
            }
            temp[0][temp[0].length - 1] = x;
            temp[1][temp[1].length - 1] = y;
            s = temp;
        }
        return s;
    }

    public static boolean isStudentExistsWithMarks(int[][] marks) {
        int total = 0;
        for (int i = 0; i < marks[0].length; i++) {
            total = total + marks[0][i];
        }
        if ((-total) == marks[0].length) {
            return true;
        }
        return false;
    }

    public static void topicAddStudents() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.print("\b " + "\b\b " + "\b\b ");
        System.out.println("\n|\t\t\t\t\tADD STUDENTS\t\t\t\t\t\t|");
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.println("\b " + "\b\b " + "\b\b ");
    }

    public static int[][] marksIncrement(int[][] marks, int x) {
        int[][] temp = new int[2][x];
        for (int i = 0; i < marks[0].length; i++) {
            temp[0][i] = marks[0][i];
            temp[1][i] = marks[1][i];
        }
        temp[0][temp[0].length - 1] = -1;
        temp[1][temp[1].length - 1] = -1;
        marks = temp;
        return marks;
    }

    public static void addMarks(int index, int[][] marks) {
        Scanner input = new Scanner(System.in);
        int x;
        do {
            System.out.print("PROGRAMMING FUNDAMENTAL Marks : ");
            x = input.nextInt();
            if (!((x <= 100) && (x >= 0))) {
                System.out.println("");
            }
        } while (!((x <= 100) && (x >= 0)));
        marks[0][index] = x;
        do {
            System.out.print("DATABASE MANAGEMENT SYSTEM Marks : ");
                    x = input.nextInt();
            if (!((x <= 100) && (x >= 0))) {
                System.out.println("Invalid Marks Please Enter Correct Marks");
            }
            marks[1][index] = x;
        } while (!((x <= 100) && (x >= 0)));
    }

    public static void topicAddStudentsWithMarks() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.print("\b " + "\b\b " + "\b\b ");
        System.out.println("\n|\t\t\t\t\tADD STUDENTS WITH MARKS\t\t\t\t\t|");
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.println("\b " + "\b\b " + "\b\b ");
    }

    public static void topicAddMarks() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.print("\b " + "\b\b " + "\b\b ");
        System.out.println("\n|\t\t\t\t\tADD MARKS\t\t\t\t\t\t|");
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.println("\b " + "\b\b " + "\b\b ");
    }

    public static int searchStudent(String[][] s) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nInput Student Id : ");
        String st = input.next();
        for (int i = 0; i < s[0].length; i++) {
            if (st.equals(s[0][i])) {
                int index = i;
                return index;
            }
        }
        return -1;
    }

    public static void topicUpdateStudentDetails() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.print("\b " + "\b\b " + "\b\b ");
        System.out.println("\n|\t\t\t\t\tUPDATE STUDENTS DETAILS\t\t\t\t\t|");
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.println("\b " + "\b\b " + "\b\b ");
    }

    public static void updateStudentDetails(String[][] s, int x) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input New Name : ");
        s[1][x] = input.next();
    }

    public static void topicUpdateMarks() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.print("\b " + "\b\b " + "\b\b ");
        System.out.println("\n|\t\t\t\t\tUPDATE MARKS\t\t\t\t\t\t|");
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.println("\b " + "\b\b " + "\b\b ");
    }

    public static void topicDeleteStudent() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.print("\b " + "\b\b " + "\b\b ");
        System.out.println("\n|\t\t\t\t\tDELETE STUDENTS\t\t\t\t\t\t|");
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.println("\b " + "\b\b " + "\b\b ");
    }

    public static String[][] deleteStudent(int index, String[][] s) {
        String[][] temp = new String[2][s[0].length - 1];
        for (int i = 0, j = 0; i < s[0].length; i++) {
            if (i == index) {
                continue;
            }
            temp[0][j] = s[0][i];
            temp[1][j] = s[1][i];
            j++;
        }
        return temp;
    }

    public static int[][] deleteMarks(int index, int[][] m) {
        int[][] temp = new int[2][m[0].length - 1];
        for (int i = 0, j = 0; i < m[0].length; i++) {
            if (i == index) {
                continue;
            }
            temp[0][j] = m[0][i];
            temp[1][j] = m[1][i];
            j++;
        }
        return temp;
    }

    public static int[] calcTotal(int[][] marks) {
        int[] t = new int[marks[0].length];
        for (int i = 0; i < t.length; i++) {
            t[i] = marks[0][i] + marks[1][i];
        }
        return t;
    }

    public static int[] calcRank(int[] total) {
        int[] rank = new int[total.length];
        int[] temp = new int[total.length];
        int o_max = 0;
        for (int i = 0; i < total.length; i++) {
            temp[i] = total[i];
        }
        int count = 0;
        int skip_count = 0;
        for (int i = 0; i < temp.length; i++) {
            int max = temp[0];
            int index = 0;
            for (int j = 0; j < temp.length; j++) {
                if (max < temp[j]) {
                    index = j;
                    max = temp[j];
                }
            }
            if (temp[index] < 0) {
                continue;
            }
            temp[index] = -2;
            count++;
            if (max != o_max) {
                rank[index] = count + skip_count;
                count = count + skip_count;
                skip_count = 0;
            } else {
                count--;
                skip_count++;
                if (count == 0) {
                    count = 1;
                }
                rank[index] = count;
            }
            o_max = max;
        }
        return rank;
    }

    public static double[] calcAvg(int[] t, int s_c) {
        double[] avg = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            avg[i] = (double) t[i] / s_c;
        }
        return avg;
    }

    public static String[][] nameSortByRank(int[] rank, String[][] s) {
        int[] temp = new int[rank.length];
        String[][] tem = new String[2][s[0].length];
        for (int i = 0; i < s[0].length; i++) {
            temp[i] = rank[i];
            tem[0][i] = s[0][i];
            tem[1][i] = s[1][i];
        }
        for (int i = temp.length - 1; i >= 0; i--) {
            int max = temp[0];
            int index = 0;
            for (int j = 0; j <= i; j++) {
                if (temp[j] > max) {
                    max = temp[j];
                    index = j;
                }
            }
            temp[index] = temp[i];
            temp[i] = max;
            String ss = tem[0][index];
            tem[0][index] = tem[0][i];
            tem[0][i] = ss;
            ss = tem[1][index];
            tem[1][index] = tem[1][i];
            tem[1][i] = ss;
        }
        return tem;
    }

    public static int[] sortRank(int[] rank) {
        int[] temp = new int[rank.length];
        for (int i = 0; i < rank.length; i++) {
            temp[i] = rank[i];
        }
        for (int i = temp.length - 1; i >= 0; i--) {
            int max = temp[0];
            int index = 0;
            for (int j = 0; j <= i; j++) {
                if (max < temp[j]) {
                    max = temp[j];
                    index = j;
                }
            }
            temp[index] = temp[i];
            temp[i] = max;
        }
        return temp;
    }

    public static int[] totalSortByRank(int[] rank, int[] total) {
        int[] tempr = new int[rank.length];
        int[] tempt = new int[total.length];
        for (int i = 0; i < rank.length; i++) {
            tempr[i] = rank[i];
            tempt[i] = total[i];
        }
        for (int i = tempr.length - 1; i >= 0; i--) {
            int max = tempr[0];
            int index = 0;
            for (int j = 0; j <= i; j++) {
                if (max < tempr[j]) {
                    max = tempr[j];
                    index = j;
                }
            }
            tempr[index] = tempr[i];
            tempr[i] = max;
            int tt = tempt[index];
            tempt[index] = tempt[i];
            tempt[i] = tt;
        }
        return tempt;
    }

    public static double[] avgSortByRank(int[] rank, double[] avg) {
        int[] tempr = new int[rank.length];
        double[] tempavg = new double[avg.length];
        for (int i = 0; i < tempr.length; i++) {
            tempr[i] = rank[i];
            tempavg[i] = avg[i];
        }
        for (int i = tempr.length - 1; i >= 0; i--) {
            int max = tempr[0];
            int index = 0;
            for (int j = 0; j <= i; j++) {
                if (max < tempr[j]) {
                    max = tempr[j];
                    index = j;
                }
            }
            tempr[index] = tempr[i];
            tempr[i] = max;
            double tavg = tempavg[index];
            tempavg[index] = tempavg[i];
            tempavg[i] = tavg;
        }
        return tempavg;
    }

    public static void topicPrintStudentDetails() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.print("\b " + "\b\b " + "\b\b ");
        System.out.println("\n|\t\t\t\tPRINT STUDENT DETAILS\t\t\t\t\t\t|");
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.println("\b " + "\b\b " + "\b\b ");
    }

    public static void topicPrintStudentRank() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.print("\b " + "\b\b " + "\b\b ");
        System.out.println("\n|\t\t\t\tPRINT STUDENT RANK\t\t\t\t\t\t|");
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.println("\b " + "\b\b " + "\b\b ");
    }

    public static int[][] sortMarksByPRF(int[][] marks) {
        int[][] temp = new int[2][marks[0].length];
        for (int i = 0; i < marks[0].length; i++) {
            temp[0][i] = marks[0][i];
            temp[1][i] = marks[1][i];
        }
        for (int i = temp[0].length - 1; i >= 0; i--) {
            int min = temp[0][0];
            int index = 0;
            for (int j = 0; j <= i; j++) {
                if (min > temp[0][j]) {
                    min = temp[0][j];
                    index = j;
                }
            }
            temp[0][index] = temp[0][i];
            temp[0][i] = min;
            int te = temp[1][index];
            temp[1][index] = temp[1][i];
            temp[1][i] = te;
        }
        return temp;
    }

    public static String[][] sortStudentsByMarks(int[] marks, String[][] students) {
        int[] tempm = new int[marks.length];
        String[][] temps = new String[2][students[0].length];
        for (int i = 0; i < tempm.length; i++) {
            tempm[i] = marks[i];
            temps[0][i] = students[0][i];
            temps[1][i] = students[1][i];
        }
        for (int i = tempm.length - 1; i >= 0; i--) {
            int min = tempm[0];
            int index = 0;
            for (int j = 0; j <= i; j++) {
                if (min > tempm[j]) {
                    min = tempm[j];
                    index = j;
                }
            }
            tempm[index] = tempm[i];
            tempm[i] = min;
            String t = temps[0][index];
            temps[0][index] = temps[0][i];
            temps[0][i] = t;
            t = temps[1][index];
            temps[1][index] = temps[1][i];
            temps[1][i] = t;
        }
        return temps;
    }

    public static void topicBestInProgrammingFundamental() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.print("\b " + "\b\b " + "\b\b ");
        System.out.println("\n|\t\t\t\tBEST IN PROGARMMIG FUNDAMENTAL\t\t\t\t\t|");
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.println("\b " + "\b\b " + "\b\b ");
    }

    public static int[][] sortMarksByDBMS(int[][] marks) {
        int[][] temp = new int[2][marks[0].length];
        for (int i = 0; i < temp[0].length; i++) {
            temp[0][i] = marks[0][i];
            temp[1][i] = marks[1][i];
        }
        for (int i = temp[0].length - 1; i >= 0; i--) {
            int min = temp[1][0];
            int index = 0;
            for (int j = 0; j <= i; j++) {
                if (temp[1][j] < min) {
                    min = temp[1][j];
                    index = j;
                }
            }
            temp[1][index] = temp[1][i];
            temp[1][i] = min;
            int t = temp[0][index];
            temp[0][index] = temp[0][i];
            temp[0][i] = t;
        }
        return temp;
    }

    public static void topicBestInDBMS() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.print("\b " + "\b\b " + "\b\b ");
        System.out.println("\n|\t\t\t\tBEST IN DATABASE MANAGEMENT SYSTEM\t\t\t\t | ");
        for (int i = 0; i < 20; i++) {
            System.out.print("-----");
        }
        System.out.println("\b " + "\b\b " + "\b\b ");
    }

    public static void main(String args[])  {

        loadLoginPage();

        Scanner input = new Scanner(System.in);
        String[][] students = new String[2][0];
        int[][] marks = new int[2][0];
        int count = 0;
        String x;
        boolean flagg;
        do {
            if (count == 0) {
                clearConsole();
                animation();
            }
            clearConsole();
            topic();
            help();
            do {
                System.out.print("Enter An Option To Continue : ");
                x = input.next();
                flagg = x.equals("1") || x.equals("2") || x.equals("3") || x.equals("4") ||
                        x.equals("5") || x.equals("6") || x.equals("7") || x.equals("8") || x.equals("9") || x.equals("10") ||
                        x.equals("exit");
                if (!flagg) {
                    System.out.println("Wrong Input Please Try Again");
                }
            } while (!flagg);
            if (x.equals("1")) {
                clearConsole();
                String s = " ";
                boolean flag = false;
                boolean flag1;
                do {
                    topicAddStudents();
                    do {
                        int u = students[0].length;
                        students = addStudents(students);
                        if (u != students[0].length) {
                            marks = marksIncrement(marks, students[0].length);
                            System.out.print("\nStudent Added Successful");
                                    flag1 = false;
                        } else {
                            System.out.println("Duplicate Index No Detected Student Added Unsuccessful\n\n");
                                    flag1 = true;
                        }
                    } while (flag1);
                    do {
                        System.out.print(" Do You Want To Continue y/n : ");
                                s = input.next();
                        flag = (s.equals("y") || s.equals("n"));
                        clearConsole();
                    } while (!flag);
                } while (!(flag && s.equals("n")));
            }
            if (x.equals("2")) {
                clearConsole();
                animation();
                clearConsole();
                String s = "";
                boolean flag = false;
                boolean flag1;
                do {
                    topicAddStudentsWithMarks();
                    do {
                        int u = students[0].length;
                        students = addStudents(students);
                        if (u != students[0].length) {
                            marks = marksIncrement(marks, students[0].length);
                            addMarks(marks[0].length - 1, marks);
                            System.out.print("\nStudent Added Successful");
                                    flag1 = false;
                        } else {
                            System.out.print("\nDuplicate Index No Detected Student Added Unsuccessful");
                                    flag1 = true;
                        }
                    } while (flag1);
                    do {
                        System.out.print(" Do You Want To Continue y/n : ");
                                s = input.next();
                        flag = (s.equals("y") || s.equals("n"));
                    } while (!flag);
                    clearConsole();
                } while (!(flag && s.equals("n")));
            }
            if (x.equals("3")) {
                clearConsole();
                topicAddMarks();
                String s;
                int xx = 0;
                boolean flag = false;
                do {
                    xx = 0;
                    int index = searchStudent(students);
                    if (index >= 0) {
                        System.out.println("Student Name : "+students[1][index]);
                        if (marks[0][index] != -1) {
                            System.out.print("\nThis Student's Marks Has Already Added \nIf You Want To Update Marks Use[4]Option In Main Menu \nDo You Want To Add Marks For Another Student");
                                    xx = -1;
                        } else {
                            addMarks(index, marks);
                            System.out.print("\nMarks Added Succesfull Do You Want To Add Marks For Another Student ? ");
                                    xx = -1;
                        }
                    }
                    if (index == -1) {
                        System.out.print("Invalid Student Id Do You Want To Search Again");
                    }
                    do {
                        System.out.print(" y/n : ");
                        s = input.next();
                        if (xx == -1) {
                            clearConsole();
                            topicAddMarks();
                        }
                        flag = (s.equals("y") || s.equals("n"));
                    } while (!flag);
                } while (!(flag && s.equals("n")));
            }
            if (x.equals("4")) {
                clearConsole();
                animation();
                clearConsole();
                topicUpdateStudentDetails();
                String s;
                boolean flag;
                do {
                    int index = searchStudent(students);
                    if (index >= 0) {
                        System.out.println("Student Name : "+students[1][index]+"\n\n\n");
                                updateStudentDetails(students, index);
                        System.out.print("Student Details Updated Successfully\nDo You Want To Update Another Student Details");
                    } else {
                        System.out.print("Invalid Student ID Do You Want To Search Again");
                    }
                    do {
                        System.out.print(" y/n : ");
                        s = input.next();
                        flag = (s.equals("y") || s.equals("n"));
                    } while (!flag);
                } while (!(flag && s.equals("n")));
            }
            if (x.equals("5")) {
                clearConsole();
                topicUpdateMarks();
                String s;
                boolean flag;
                do {
                    int lk = 0;
                    int index = searchStudent(students);
                    if (index >= 0) {
                        if (marks[0][index] != -1) {
                            String su = " ";
                            System.out.println("Student Name : "+students[1][index]);
                            System.out.printf("\n\nPROGRAM FUNDAMENTAL MARKS %8s: %-5d\n", su, marks[0][index]);
                            System.out.printf("DATABASE MANAGEMENT SYSTEM MARKS : %-5d\n ",marks[1][index]);
                            addMarks(index, marks);
                            System.out.print("Marks Have Been Updated Successfully\nDo You Want To Update Marks For Another Students");
                                    lk = 1;
                        } else {
                            System.out.print("This Student's Marks Yet to Be added\nDo You Want To Update Marks For Another Students");
                                    lk = 1;
                        }
                    }
                    if (index == -1) {
                        System.out.print("Invalid Student Id Detected \nDo You Want To Search Again");
                    }
                    do {
                        System.out.print(" y/n : ");
                        s = input.next();
                        if (lk ==
                                1) {
                            clearConsole();
                            topicUpdateMarks();
                        }
                        flag = (s.equals("y") || s.equals("n"));
                    } while (!flag);
                } while (!(flag && s.equals("n")));
            }
            if (x.equals("6")) {
                clearConsole();
                animation();
                clearConsole();
                topicDeleteStudent();
                String s;
                boolean flag;
                do {
                    int index = searchStudent(students);
                    if (index >= 0) {
                        students = deleteStudent(index, students);
                        marks = deleteMarks(index, marks);
                        System.out.print("\n\nStudent Data Deleted Successful \nDo You Want To Delete Another Student");
                    } else {
                        System.out.print("\n\nInvalid Student Id Detected\nDo You Want To Search Again");
                    }
                    do {
                        System.out.print(" y/n : ");
                        s = input.next();
                        flag = (s.equals("y") || s.equals("n"));
                    } while (!flag);
                    clearConsole();
                } while (!(flag && s.equals("n")));
            }
            int[] total = calcTotal(marks);
            double[] avg = calcAvg(total, marks.length);
            int[] rank = calcRank(total);
            if (x.equals("7")) {
                clearConsole();
                String s;
                boolean flag;
                do {
                    topicPrintStudentDetails();
                    if (students[0].length > 0) {
                        int index = searchStudent(students);
                        if (index >= 0) {
                            if (total[index] >= 0) {
                                String lk = rank[index] == 1 ?
                                        "(first)" : rank[index] == 2 ? "(Second)" : rank[index] == 3 ? "(third)" : "";
                                System.out.println("Student Name : "+students[1][index]);
                                        System.out.println("\n\n\n\n+--------- ---------------------------------------------- + -----------------------+");
                                                System.out.printf("|Programming Fundamental Marks | % 23d |\n",marks[0][index]);
                                                System.out.printf("|Database Management System Marks | % 23d |\n",marks[1][index]);
                                                System.out.printf("|Total Marks | % 23d |\n",total[index]);
                                                System.out.printf("|Average Marks | % 23.2f |\n",avg[index]);
                                if (rank[index] == 1 || rank[index] == 3) {
                                    System.out.printf("|Rank | %16d %-7s |\n", rank[index], lk);
                                }
                                    if (rank[index] == 2) {
                                        System.out.printf("|Rank |%15d%-8s |\n",rank[index],lk);}
                                        if (rank[index] > 3) {
                                            System.out.printf("|Rank | % 23d |\n ",rank[index],lk);}
                                            System.out.println("+------------------ ------------------------------------ - +-----------------------+");
                                                    System.out.print("\n\n\n\n\n Do You Want to Search Another Student Details");
                                        } else {
                                            System.out.println("Student Name : "+students[1][index]);
                                                    System.out.print("\n\n\n\nMarks Yet To Be Added \nDo You Want to Search Another Student Details");
                                        }
                                    }
                                    if (index == -1) {
                                        System.out.print("Invalid Index Number Detected \nDo You Want To Search Again");
                                    }
                                } else {
                                    System.out.print("\n\n\nNo Student Records \nDo You Want to Search Again ? ");
                                }
                                do {
                                    System.out.print(" y/n : ");
                                    s = input.next();
                                    flag = (s.equals("y") || s.equals("n"));
                                } while (!flag);
                                clearConsole();
                            } while (!(flag && s.equals("n"))) ;
                        }
                        if (x.equals("8")) {
                            clearConsole();
                            animation();
                            clearConsole();
                            String[][] sstudents = nameSortByRank(rank, students);
                            int[] stotal = totalSortByRank(rank, total);
                            int[] srank = sortRank(rank);
                            double[] savg = avgSortByRank(rank, avg);
                            String s;
                            boolean flag;
                            do {
                                topicPrintStudentRank();
                                if (!(isStudentExistsWithMarks(marks))) {
                                    System.out.println("+-------+---------------+------------ ---------- - +-----------------------+-----------------------+");
                                            System.out.println("|" + "Rank" + "\t|\t" + "ID" + "\t|\t "+" Name"+"\t\t |\t"+" Total Marks"+"\t |\t"+" Avg.marks"+"\t | ");
                                                    System.out.println("+-------+---------------+------------ ---------- - +-----------------------+-----------------------+");
                                    for (int i = 0; i < sstudents[0].length; i++) {
                                        if (stotal[i] < 0) {
                                            continue;
                                        }
                                        System.out.printf("|%7d", srank[i]);
                                        System.out.printf("|%15s", sstudents[0][i]);
                                        System.out.printf("|%23s", sstudents[1][i]);
                                        System.out.printf("|%23d", stotal[i]);
                                        System.out.printf("|%23.2f|\n", savg[i]);
                                    }
                                    System.out.println("+-------+---------------+------------ ---------- - +-----------------------+-----------------------+");
                                } else {
                                    System.out.println("\n\n\n\nNo Student Records Found\nAdd Data To The System And Try Again.");
                                }
                                do {
                                    System.out.print("\n\n\n\nDo You Want To Go Back To Main Menu y / n :");
                                    s = input.next();
                                    flag = (s.equals("y") || s.equals("n"));
                                } while (!flag);
                                clearConsole();
                            } while (!(flag && s.equals("y")));
                        }
                        if (x.equals("9")) {
                            clearConsole();
                            int[][] tmarks = sortMarksByPRF(marks);
                            String[][] tstudents = sortStudentsByMarks(marks[0], students);
                            String s;
                            boolean flag;
                            do {
                                topicBestInProgrammingFundamental();
                                if (!(isStudentExistsWithMarks(marks))) {
                                    System.out.println("+-------+---------------+------------ -- - +---------------+");
                                            System.out.println("| ID\t| NAME\t| PRF MARKS\t | DBMS MARKS \t | ");
                                                    System.out.println("+-------+---------------+------------ -- - +---------------+");
                                    for (int i = 0; i < tmarks[0].length; i++) {
                                        if (tmarks[0][i] < 0) {
                                            continue;
                                        }
                                        ;
                                        System.out.printf("|%6s ", tstudents[0][i]);
                                        System.out.printf("|%-15s", tstudents[1][i]);
                                        System.out.printf("|%-15d", tmarks[0][i]);
                                        System.out.printf("|%-15d|\n", tmarks[1][i]);
                                    }
                                    System.out.println("+-------+---------------+------------ -- - +--------------- ");
                                } else {
                                    System.out.println("\n\n\nStudents Data Not Found\nAdd New Data Into The System And Try Again");
                                }
                                do {
                                    System.out.print("\n\n\nDo You Want To Go Back To Main Menu y / n :");
                                    s = input.next();
                                    flag = (s.equals("y") || s.equals("n"));
                                } while (!flag);
                                clearConsole();
                            } while (!(flag && s.equals("y")));
                        }
                        if (x.equals("10")) {
                            clearConsole();
                            int[][] tmarks = sortMarksByDBMS(marks);
                            String[][] tstudents = sortStudentsByMarks(marks[1], students);
                            String s;
                            boolean flag;
                            do {
                                topicBestInDBMS();
                                if (!(isStudentExistsWithMarks(marks))) {
                                    System.out.println("+-------+---------------+------------ -- - +---------------+");
                                            System.out.println("| ID\t| NAME\t| DBMS MARKS\t | PRF MARKS \t | ");
                                                    System.out.println("+-------+---------------+------------ -- - +---------------+");
                                    for (int i = 0; i < tmarks[0].length; i++) {
                                        if ((tmarks[1][i] + tmarks[0][i]) == 0) {
                                            continue;
                                        }
                                        System.out.printf("|%6s ", tstudents[0][i]);
                                        System.out.printf("|%-15s", tstudents[1][i]);
                                        System.out.printf("|%-15d", tmarks[1][i]);
                                        System.out.printf("|%-15d|\n", tmarks[0][i]);
                                    }
                                    System.out.println("+-------+---------------+------------ -- - +---------------+");
                                } else {
                                    System.out.println("\n\n\nStudents Data Not Found\nAdd New Data Into The System And Try Again");
                                }
                                do {
                                    System.out.print("\n\n\nDo You Want To Go Back To Main Menu y / n :");
                                    s = input.next();
                                    flag = (s.equals("y") || s.equals("n"));
                                } while (!flag);
                                clearConsole();
                            } while (!(flag && s.equals("y")));
                        }
                        if (x.equals("exit")) {
                            System.exit(0);
                        }
                        clearConsole();
                        count++;
                    } while (true) ;
                }
            }
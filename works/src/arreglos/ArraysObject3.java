package arreglos;

import javax.swing.JOptionPane;

public class ArraysObject3 {
    private int district;
    private int candidateA;
    private int candidateB;
    private int candidateC;
    private int candidateD;

    public static void main(String[] args) {
        String msg = "";
        boolean winner = false;
        ArraysObject3[] district = new ArraysObject3[5];
        int[][] totalVotes = new int [4][2];
        int first = -1, firstCandidate = -1;
        int second = -1, secondCandidate = -1;

        district[0] = new ArraysObject3(1, 194, 48, 206, 45);
        district[1] = new ArraysObject3(2, 180, 20, 320, 16);
        district[2] = new ArraysObject3(3, 221, 90, 140, 20);
        district[3] = new ArraysObject3(4, 432, 50, 821, 14);
        district[4] = new ArraysObject3(5, 820, 61, 946, 18);

        msg += "District | Candidate A | Candidate B | Candidate C | Candidate D\n";
        msg += "---------------------------------------------------------------------------------------\n";
        for(int i=0; i<district.length; i++) {
            msg += district[i].stringRow();
        }
        calculateTotal(district, totalVotes);
        msg += "---------------------------------------------------------------------------------------\n";
        msg += "              |       "+totalVotes[0][0]+"       |        "+totalVotes[1][0]+"         |        "+totalVotes[2][0]+"       |        "+totalVotes[3][0]+ "\n";
        msg += "              |        "+totalVotes[0][1]+"%       |         "+totalVotes[1][1]+"%         |         "+totalVotes[2][1]+"%       |         "+totalVotes[3][1]+ "%\n";

        for(int i=0; i<totalVotes.length; i++) {
            if(totalVotes[i][1] > 50) {
                JOptionPane.showMessageDialog(null, "Candidate "+ getCandidate(i) + " has won the elections");
                winner = true;
            }
        }

        JOptionPane.showMessageDialog(null, msg);

        if(!winner) {
            for(int i=0; i<totalVotes.length; i++) {
                if(first < totalVotes[i][1]) {
                    second = first;
                    secondCandidate = firstCandidate;
                    first = totalVotes[i][1];
                    firstCandidate = i;
                } else
                if(second < totalVotes[i][1]) {
                    second = totalVotes[i][1];
                    secondCandidate = i;
                }
            }
            JOptionPane.showMessageDialog(null, "To second round:\nCandidate "+getCandidate(firstCandidate)+"\nCandidate "+getCandidate(secondCandidate));
        }
    }

    public static String getCandidate(int i) {
        String candidate = "";
        switch (i) {
            case 0:
                candidate = "A";
                break;
            case 1:
                candidate = "B";
                break;
            case 2:
                candidate = "C";
                break;
            case 3:
                candidate = "D";
                break;
        }
        return candidate;
    }

    public static void calculateTotal(ArraysObject3[] district, int[][] totalVotes) {
        int total=0, votes;
        for(int dis=0; dis<district.length; dis++) {
            for(int v=0; v<totalVotes.length; v++) {
                votes = district[dis].getVoteOf(v);
                totalVotes[v][0] += votes;
                total += votes;
            }
        }
        for (int i=0; i<totalVotes.length; i++) {
            totalVotes[i][1] = totalVotes[i][0] * 100 / total;
        }
    }

    public ArraysObject3(int district, int candidateA, int candidateB, int candidateC, int candidateD) {
        this.district = district;
        this.candidateA = candidateA;
        this.candidateB = candidateB;
        this.candidateC = candidateC;
        this.candidateD = candidateD;
    }

    public int getVoteOf(int candidate) {
        switch (candidate) {
            case 0: return candidateA;
            case 1: return candidateB;
            case 2: return candidateC;
            case 3: return candidateD;
        }
        return 0;
    }

    public String stringRow() {
        return "    "+district + "        |        " + candidateA + "        |         " + candidateB + "          |         " + candidateC + "        |         " + candidateD + "\n";
    }
}

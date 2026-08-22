package vn.edu.rikkei.session07.ex04;

public class Student {
    String studentId;
    String fullName;
    double mathScore;
    double literatureScore;
    double englishScore;

    public Student(String studentId, String fullName,
                   double mathScore, double literatureScore,
                   double englishScore) {

        this.studentId = studentId;
        this.fullName = fullName;

        this.mathScore = checkScore(mathScore);
        this.literatureScore = checkScore(literatureScore);
        this.englishScore = checkScore(englishScore);
    }

    private double checkScore(double score) {
        if (score >= 0 && score <= 10) {
            return score;
        }

        System.out.println("Điểm không hợp lệ, tự động gán = 0");
        return 0;
    }

    public double getAverageScore() {
        return (mathScore + literatureScore + englishScore) / 3;
    }

    public String getAcademicStanding() {
        double average = getAverageScore();

        if (average >= 8) {
            return "Giỏi";
        } else if (average >= 6.5) {
            return "Khá";
        } else if (average >= 5) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    public void displayStudentProfile() {
        System.out.println("Mã SV: " + studentId);
        System.out.println("Họ tên: " + fullName);

        System.out.printf("Toán: %.1f | Văn: %.1f | Anh: %.1f%n",
                mathScore, literatureScore, englishScore);

        System.out.printf("Điểm trung bình: %.2f%n", getAverageScore());
        System.out.println("Xếp loại: " + getAcademicStanding());
    }
}

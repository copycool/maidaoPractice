package cn.maidaotech.java07.work.chapter05.question10.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Score {
    private Long id;

    private Long sno;

    private Long courseNo;

    private Long score;

    private Long createdAt;

    private Long updatedAt;

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", sno=" + sno +
                ", courseNo=" + courseNo +
                ", score=" + score +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
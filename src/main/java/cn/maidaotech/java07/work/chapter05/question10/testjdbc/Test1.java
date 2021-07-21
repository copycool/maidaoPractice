package cn.maidaotech.java07.work.chapter05.question10.testjdbc;

import cn.maidaotech.java07.work.chapter05.question10.pojo.Score;
import cn.maidaotech.java07.work.chapter05.question10.pojo.Student;
import cn.maidaotech.java07.work.chapter05.question10.service.ScoreService;
import cn.maidaotech.java07.work.chapter05.question10.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@SpringBootTest
public class Test1 {

    @Autowired
    private StudentService studentService;
    @Autowired
    private ScoreService scoreService;

    @Test
    public void test(){
        List<Student> students = studentService.selectAll();
        students.stream().forEach(student -> System.out.println(student.toString()));
    }

    /**
     * 1.修改录入错误的学生姓名、学生成绩
     */
    @Test
    public void test1(){
        Student student = new Student(1L,20182512770001L,1L,1L,"张三",19,0,10001L);
        int i = studentService.updateByPrimaryKeySelective(student);
        if (i > 0){
            System.err.println("修改成功");
        }
    }

    /**
     * 2.统计每门课的学生人数
     */
    @Test
    public void test2(){
        List<Map<Object, Object>> maps = scoreService.selectStudentCountByCourse();
        printList(maps);
    }

    /**
     * 3.查询某一门课程不及格的学生信息
     */
    @Test
    public void test3(){
        List<Student> students = studentService.selectFailStudentCountByCourdeId(10001L);
        students.stream().forEach(student -> System.err.println(student.toString()));
    }

    /**
     * 4.查询某一个学生的各科成绩
     */
    @Test
    public void test4(){
        List<Score> scores = scoreService.selectStudentScoreBySno(20182512770001L);
        scores.stream().forEach(score -> System.err.println(score.toString()));
    }

    /**
     * 5.查询一个班级每个学生的总成绩，并按总成绩由高到低排序；
     */
    @Test
    public void test5(){
        List<Map<Object, Object>> maps = scoreService.selectStudentSumScoreByCno(10001L);
        printList(maps);
    }

    /**
     * 6.查询每门课都大于80分的学生信息
     */
    @Test
    public void test6(){
        List<Student> students = studentService.selectAllCourseScoreExceedEighty();
        students.stream().forEach(student -> System.err.println(student.toString()));
    }

    /**
     * 7.查询至少有一门课程不及格的学生信息
     */
    @Test
    public void test7(){
        List<Student> students = studentService.selectAtLeastOneFailed();
        students.stream().forEach(student -> System.err.println(student.toString()));
    }

    /**
     * 8.查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序
     */
    @Test
    public void test8(){
        List<Map<Object, Object>> maps = scoreService.selectEveryCalssAverageScoreByCourseId(10001L);
        printList(maps);
    }

    /**
     * 9.查询各科成绩最高分、最低分和平均分
     */
    @Test
    public void test9(){
        List<Map<Object, Object>> maps = scoreService.selectEveryCourseScoreMaxMinAvg();
        printList(maps);
    }

    /**
     * 10.(附加题)有如下形式的表格：
     * 课程ID、课程名称、最高分、最低分、平均分、及格率、中等率、优良率、优秀率（及格为>=60
     * ，中等为70-80，优良为：80-90，优秀为>=90）按照平均分降序排列。思考并尝试编写查询SQL语句。
     */
    @Test
    public void test10(){
        List<Map<Object, Object>> maps = scoreService.selectAdditionalQuestions();
        printList(maps);
    }

    /**
     * 打印 List<Map<Object,Object>> maps
     * @param maps
     */
    public static void printList(List<Map<Object,Object>> maps){
        for (int i = 0; i < maps.size(); i++) {
            Map<Object, Object> map = maps.get(i);
            System.out.println(map);
        }
    }
}
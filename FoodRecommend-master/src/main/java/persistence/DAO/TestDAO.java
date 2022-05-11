package persistence.DAO;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import persistence.DTO.TestDTO;
import persistence.PooledDataSource;
import persistence.mapper.TestMapper;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class TestDAO {

    private SqlSessionFactory sqlSessionFactory = null;

    public TestDAO(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public List<TestDTO> getRandom(){
        SqlSession session = sqlSessionFactory.openSession();
        TestMapper mapper = session.getMapper(TestMapper.class);
        List<TestDTO> rnd = mapper.getRandom();
        return rnd;
    }
//    final DataSource ds = PooledDataSource.getDataSource();
//
//    private Connection conn;
//    PreparedStatement pstmt = null;
//    ResultSet rs = null;
//    Statement stmt = null;
//
//    public TestDAO(SqlSessionFactory sqlSessionFactory) {
//        try {
//            conn = ds.getConnection();
//        }catch(Exception e) {
//            try {
//                conn.close();
//            }catch(SQLException e1) {}
//        }
//    }
//
//    public List<TestDTO> getRandom(){
//        SqlSession session = sqlSessionFactory.openSession();
//        TestMapper mapper = session.getMapper(TestMapper.class);
//        List<TestDTO> rnd = mapper.getRandom();
//        return rnd;
//    }

}

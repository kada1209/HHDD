package test1;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.*;

import org.assertj.core.util.DateUtil;


import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2019/3/8.
 */
public class HbaseTest {

//    String array[] = {"2019-03-07 14:15:51","2019-03-08 14:15:51","2019-03-09 14:15:51","2019-03-10 14:15:51",
//            "2019-03-11 14:15:51","2019-03-12 14:15:51"};
    public static void main(String[] args) throws ParseException, IOException {
        String array[] = {"2019-03-09 09:15:51","2019-03-10 09:15:51",
            "2019-03-11 09:15:51","2019-03-12 09:15:51","2019-03-13 09:15:51","2019-03-14 09:15:51"};
        int userId = 12268738;
        int len = array.length;
        for(int i=0;i<len;i++){
            String aTime = array[i];
            String key = rowKey(userId,aTime);
            StringBuilder stringBuilder = new StringBuilder();
            String str1 = "put 'read_history:user_reading_books_log',";
            stringBuilder.append(str1);
            stringBuilder.append("'"+key);
            stringBuilder.append("',");
            stringBuilder.append("'info:userId'");
            stringBuilder.append(",'"+userId+"'");
            System.out.println(stringBuilder);
        }




    }

    /**
     * 连接hbase
     */
   public static void getAdmin() throws IOException {

       //第一步，设置HBsae配置信息
       Configuration configuration = HBaseConfiguration.create();
       configuration.set("zookeeper.znode.parent","/hbase-unsecure"); //与 hbase-site-xml里面的配置信息 zookeeper.znode.parent 一致
       configuration.set("hbase.zookeeper.quorum","10.0.10.62");  //hbase 服务地址
       configuration.set("hbase.zookeeper.property.clientPort","2181"); //端口号
       //这里使用的是接口Admin   该接口有一个实现类HBaseAdmin   也可以直接使用这个实现类
       // HBaseAdmin baseAdmin = new HBaseAdmin(configuration);
       Admin admin = ConnectionFactory.createConnection(configuration).getAdmin();

       if(admin !=null){
           try {
               //获取到数据库所有表信息
               HTableDescriptor[] allTable = admin.listTables();
               for (HTableDescriptor hTableDescriptor : allTable) {
                   System.out.println(hTableDescriptor.getNameAsString());
               }
           }catch (IOException e) {
               e.printStackTrace();
           }
       }


   }



    /**
     * 将指定时间转换为时间戳
     * @param s 指定时间
     * @return
     * @throws ParseException
     */
    public static String dateToStamp(String s) throws ParseException {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);
        return res;
    }

    /**
     * 制造rowKey
     * @param userId 用户id
     * @return
     * @throws ParseException
     */
    public static String rowKey(int userId ,String time) throws ParseException {
        StringBuilder logBuilder = new StringBuilder();
        String md5Str = DigestUtils.md5Hex(String.valueOf(userId));
        logBuilder.append(md5Str);
//        String logTime = dateToStamp("2019-03-08 15:30:31");
        String logTime = dateToStamp(time);
        //logBuilder.append("-").append(System.currentTimeMillis());
        logBuilder.append("-").append(logTime);
        String logRowKey = logBuilder.toString();
        //System.out.print(logRowKey);
        return logRowKey;
    }




    /**
     * 向hbase中插入数据
     */
//    public static void  putHbase(int userId ,String time) throws ParseException {
//
//
//
//
//
//        String logRowKey = rowKey(userId,time);
//
//        Put logPut = new Put(logRowKey.getBytes());
//        logPut.addColumn(COLUMN_FAMILY.getBytes(), UserReadingBooksConstant.USER_ID.getBytes(), String.valueOf(userId).getBytes());
//        logPut.addColumn(COLUMN_FAMILY.getBytes(), UserReadingBooksConstant.BOOK_ID.getBytes(), String.valueOf(userReadingBooksHbaseTO.getBookId()).getBytes());
//        logPut.addColumn(COLUMN_FAMILY.getBytes(), UserReadingBooksConstant.COLLECT_ID.getBytes(), String.valueOf(userReadingBooksHbaseTO.getCollectId()).getBytes());
//        //本次阅读到第几页
//        logPut.addColumn(COLUMN_FAMILY.getBytes(), UserReadingBooksConstant.READ_CURRENT_PAGE.getBytes(), String.valueOf(userReadingBooksHbaseTO.getReadCurrentPage()).getBytes());
//        //本次阅读结束时间点
//        logPut.addColumn(COLUMN_FAMILY.getBytes(), UserReadingBooksConstant.LAST_READ_TIME.getBytes(), String.valueOf(DateUtil.getNewDate(userReadingBooksHbaseTO.getLastReadTime())).getBytes());
//        //本次阅读时长
//        logPut.addColumn(COLUMN_FAMILY.getBytes(), UserReadingBooksConstant.READ_TIME.getBytes(), String.valueOf(userReadingBooksHbaseTO.getReadTime()).getBytes());
//        //本次阅读页数
//        logPut.addColumn(COLUMN_FAMILY.getBytes(), UserReadingBooksConstant.PAGE_COUNT.getBytes(), String.valueOf(userReadingBooksHbaseTO.getPageCount()).getBytes());
//    }
}

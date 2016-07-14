package util

import java.math.BigInteger
import java.text.SimpleDateFormat
import java.util.{Calendar, Date}

/**
  * Created by C.J.YOU on 2016/1/13.
  * 格式化时间的工具类
  */
 object TimeUtil {

  def getTime(timeStamp: String): String = {
    val sdf: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss")
    val bigInt: BigInteger = new BigInteger(timeStamp)
    val date: String = sdf.format(bigInt)
    date
  }

  def getDay: String = {
    val sdf: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd")
    val date: String = sdf.format(new Date)
    date
  }

  def getCurrentHour: Int = {
    val calendar = Calendar.getInstance
    calendar.setTime(new Date)
    calendar.get(Calendar.HOUR_OF_DAY)
  }

  def getPreHourStr: String = {
    val date = new Date(new Date().getTime - 60 * 60 * 1000)
    val sdf: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH")
    sdf.format(date)
  }

  /**
    * 获取今天的日期
    * @return
    */
  def getNowDate(): String = {
    val now: Date = new Date()
    val  dateFormat: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd")
    val res = dateFormat.format( now )
    res
  }


  /**
    * 获取本周的开始时间
    */
  def Null(){

  }

  /**
    * 获取本月的开始时间
    * http://blog.csdn.net/springlustre/article/details/47273353
    */




}

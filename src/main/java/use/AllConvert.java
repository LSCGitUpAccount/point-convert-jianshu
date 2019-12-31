package use;

import beans.GPS;
import utils.GPSConvertUtils;

public class AllConvert {

    // wg84坐标经度、纬度
    private static final double wgslng = 116.099669;
    private static final double wgslat = 39.931434;

    public static void main(String[] args) {
        // 1. wg84坐标 => 火星坐标
        GPS gps84_to_gcj02 = GPSConvertUtils.gps84_To_Gcj02(wgslat, wgslng);
        System.out.println("wg84坐标转换为火星坐标结果:"+gps84_to_gcj02.toString());

        // 2. 火星坐标 => wg84坐标
        GPS gcj_to_gps84 = GPSConvertUtils.gcj_To_Gps84(gps84_to_gcj02.getLat(), gps84_to_gcj02.getLon());
        System.out.println("火星坐标转换为wg84坐标结果:"+gcj_to_gps84.toString());

        // 3. 火星坐标GCJ-02 => 百度坐标BD-09
        GPS gcj02_to_bd09 = GPSConvertUtils.gcj02_To_Bd09(gps84_to_gcj02.getLat(), gps84_to_gcj02.getLon());
        System.out.println("火星坐标转换为百度bd-09坐标结果:"+gcj02_to_bd09.toString());

        // 4. 百度坐标BD-09 => 火星坐标GCJ-02
        GPS bd09_to_gcj02 = GPSConvertUtils.bd09_To_Gcj02(gcj02_to_bd09.getLat(), gcj02_to_bd09.getLon());
        System.out.println("百度bd-09坐标转换为火星坐标结果:"+bd09_to_gcj02.toString());

        // 5. 百度坐标BD-09 => wg84坐标
        GPS bd09_to_gps84 = GPSConvertUtils.bd09_To_Gps84(gcj02_to_bd09.getLat(), gcj02_to_bd09.getLon());
        System.out.println("百度bd-09坐标转换为wg84坐标结果:"+bd09_to_gps84.toString());
    }
}

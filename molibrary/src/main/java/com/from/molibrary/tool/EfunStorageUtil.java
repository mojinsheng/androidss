package com.from.molibrary.tool;

import java.io.File;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;

/**
* <p>Title: EfunStorageUtil</p>
* <p>Description: 存储空间工具类</p>
* <p>Company: EFun</p> 
* @author GanYuanrong
* @date 2015年1月14日
*/
public class EfunStorageUtil {


	
	/**
	 * SD card 是否存在
	 * @param
	 * @return true存在
	 */
	private static boolean isExternalStorageExist(){
		return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
	}
	
	public static boolean isAccess(){
		return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
	}
	

	/**
	 * 获取文件系统（内置，外置）可用存储大小，
	 */
	private static long getFileSystemSize(Context context) { 
		if(!isExternalStorageExist()){
			return getAvailableBytes(context.getFilesDir());
		}
        return getAvailableBytes(Environment.getExternalStorageDirectory());
    }
	/**
	 * 是否有足够空间
	 * @param currentBytes 需要比较的大小
	 * @return
	 */
	public static boolean hasSpecificSize(Context context,long currentBytes){
		if(currentBytes < getFileSystemSize(context)){
			return true;
		}
		return false;
	}
	
	/**
	 * 获取指定目录下的可用存储大小
	 * @param root 文件目录
	 * @return
	 */
	private static long getAvailableBytes(File root) {
		StatFs stat = new StatFs(root.getPath());
		long availableBlocks = (long) stat.getAvailableBlocks() - 4;
		return stat.getBlockSize() * availableBlocks;
	}
	
	
	
}

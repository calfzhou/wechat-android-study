package com.tencent.kingkong;

import java.io.File;
import java.util.Comparator;

class FileUtils$1
  implements Comparator
{
  public int compare(File paramFile1, File paramFile2)
  {
    return (int)(paramFile2.lastModified() - paramFile1.lastModified());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.FileUtils.1
 * JD-Core Version:    0.6.2
 */
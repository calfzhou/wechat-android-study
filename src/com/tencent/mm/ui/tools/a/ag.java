package com.tencent.mm.ui.tools.a;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

final class ag
  implements FileFilter
{
  public final boolean accept(File paramFile)
  {
    return Pattern.matches("cpu[0-9]+", paramFile.getName());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.ag
 * JD-Core Version:    0.6.2
 */
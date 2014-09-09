package com.tencent.mm.pluginsdk.ui.tools;

import java.io.File;
import java.io.FileFilter;

final class z
  implements FileFilter
{
  z(y paramy)
  {
  }

  public final boolean accept(File paramFile)
  {
    return !paramFile.isHidden();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.z
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.pluginsdk;

import com.tencent.mm.h;
import java.util.HashMap;

public final class b
{
  private static HashMap htc = null;

  public static int Z(String paramString, int paramInt)
  {
    if (htc == null)
    {
      HashMap localHashMap = new HashMap();
      htc = localHashMap;
      localHashMap.put("avi", Integer.valueOf(h.RI));
      htc.put("m4v", Integer.valueOf(h.RI));
      htc.put("vob", Integer.valueOf(h.RI));
      htc.put("mpeg", Integer.valueOf(h.RI));
      htc.put("mpe", Integer.valueOf(h.RI));
      htc.put("asx", Integer.valueOf(h.RI));
      htc.put("asf", Integer.valueOf(h.RI));
      htc.put("f4v", Integer.valueOf(h.RI));
      htc.put("flv", Integer.valueOf(h.RI));
      htc.put("mkv", Integer.valueOf(h.RI));
      htc.put("wmv", Integer.valueOf(h.RI));
      htc.put("wm", Integer.valueOf(h.RI));
      htc.put("3gp", Integer.valueOf(h.RI));
      htc.put("mp4", Integer.valueOf(h.RI));
      htc.put("rmvb", Integer.valueOf(h.RI));
      htc.put("rm", Integer.valueOf(h.RI));
      htc.put("ra", Integer.valueOf(h.RI));
      htc.put("ram", Integer.valueOf(h.RI));
      htc.put("mp3pro", Integer.valueOf(h.Rw));
      htc.put("vqf", Integer.valueOf(h.Rw));
      htc.put("cd", Integer.valueOf(h.Rw));
      htc.put("md", Integer.valueOf(h.Rw));
      htc.put("mod", Integer.valueOf(h.Rw));
      htc.put("vorbis", Integer.valueOf(h.Rw));
      htc.put("au", Integer.valueOf(h.Rw));
      htc.put("amr", Integer.valueOf(h.Rw));
      htc.put("silk", Integer.valueOf(h.Rw));
      htc.put("wma", Integer.valueOf(h.Rw));
      htc.put("mmf", Integer.valueOf(h.Rw));
      htc.put("mid", Integer.valueOf(h.Rw));
      htc.put("midi", Integer.valueOf(h.Rw));
      htc.put("mp3", Integer.valueOf(h.Rw));
      htc.put("aac", Integer.valueOf(h.Rw));
      htc.put("ape", Integer.valueOf(h.Rw));
      htc.put("aiff", Integer.valueOf(h.Rw));
      htc.put("aif", Integer.valueOf(h.Rw));
      htc.put("jfif", Integer.valueOf(h.Rz));
      htc.put("tiff", Integer.valueOf(h.Rz));
      htc.put("tif", Integer.valueOf(h.Rz));
      htc.put("jpe", Integer.valueOf(h.Rz));
      htc.put("dib", Integer.valueOf(h.Rz));
      htc.put("jpeg", Integer.valueOf(h.Rz));
      htc.put("jpg", Integer.valueOf(h.Rz));
      htc.put("png", Integer.valueOf(h.Rz));
      htc.put("bmp", Integer.valueOf(h.Rz));
      htc.put("gif", Integer.valueOf(h.Rz));
      htc.put("rar", Integer.valueOf(h.RC));
      htc.put("zip", Integer.valueOf(h.RC));
      htc.put("7z", Integer.valueOf(h.RC));
      htc.put("iso", Integer.valueOf(h.RC));
      htc.put("cab", Integer.valueOf(h.RC));
      htc.put("doc", Integer.valueOf(h.RL));
      htc.put("docx", Integer.valueOf(h.RL));
      htc.put("ppt", Integer.valueOf(h.RA));
      htc.put("pptx", Integer.valueOf(h.RA));
      htc.put("xls", Integer.valueOf(h.Rt));
      htc.put("xlsx", Integer.valueOf(h.Rt));
      htc.put("txt", Integer.valueOf(h.RE));
      htc.put("rtf", Integer.valueOf(h.RE));
      htc.put("pdf", Integer.valueOf(h.Rx));
    }
    Integer localInteger = (Integer)htc.get(paramString);
    if (localInteger == null)
      return paramInt;
    return localInteger.intValue();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.b
 * JD-Core Version:    0.6.2
 */
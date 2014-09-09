package com.tencent.mm.a;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public final class l
{
  public static String a(File paramFile, boolean paramBoolean, String paramString)
  {
    if (paramString != null)
    {
      File localFile2 = new File(paramString).getParentFile();
      if ((localFile2 != null) && (!localFile2.exists()))
        localFile2.mkdirs();
    }
    ArrayList localArrayList = new ArrayList();
    if (paramFile.isDirectory())
    {
      File[] arrayOfFile = paramFile.listFiles();
      if (arrayOfFile == null)
        return null;
      for (int j = 0; j < arrayOfFile.length; j++)
        localArrayList.add(arrayOfFile[j]);
      if (paramString == null)
        paramString = paramFile.getAbsolutePath() + File.separator + paramFile.getName() + ".zip";
    }
    File localFile1;
    while (true)
    {
      localFile1 = new File(paramString);
      if (localFile1.exists())
        localFile1.delete();
      try
      {
        a(localArrayList, localFile1);
        int i = 0;
        if (paramBoolean)
          while (true)
            if (i < localArrayList.size())
            {
              ((File)localArrayList.get(i)).delete();
              i++;
              continue;
              localArrayList.add(paramFile);
              if (paramString != null)
                break;
              paramString = paramFile.getAbsoluteFile().getParentFile().getAbsolutePath() + File.separator + paramFile.getName() + ".zip";
            }
      }
      catch (Exception localException)
      {
        return null;
      }
    }
    return localFile1.getAbsolutePath();
  }

  private static void a(File paramFile, ZipOutputStream paramZipOutputStream, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder().append(paramString);
    if (paramString.trim().length() == 0);
    String str2;
    for (String str1 = ""; ; str1 = File.separator)
    {
      str2 = str1 + paramFile.getName();
      if (!paramFile.isDirectory())
        break;
      File[] arrayOfFile = paramFile.listFiles();
      int j = arrayOfFile.length;
      for (int k = 0; k < j; k++)
        a(arrayOfFile[k], paramZipOutputStream, str2);
    }
    byte[] arrayOfByte = new byte[131072];
    BufferedInputStream localBufferedInputStream = new BufferedInputStream(new FileInputStream(paramFile), 131072);
    paramZipOutputStream.putNextEntry(new ZipEntry(str2));
    while (true)
    {
      int i = localBufferedInputStream.read(arrayOfByte);
      if (i == -1)
        break;
      paramZipOutputStream.write(arrayOfByte, 0, i);
    }
    localBufferedInputStream.close();
    paramZipOutputStream.flush();
    paramZipOutputStream.closeEntry();
  }

  public static void a(Collection paramCollection, File paramFile)
  {
    ZipOutputStream localZipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(paramFile), 131072));
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      File localFile = (File)localIterator.next();
      if (localFile.exists())
        a(localFile, localZipOutputStream, "");
    }
    localZipOutputStream.close();
  }

  // ERROR //
  public static boolean l(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 14	java/io/File
    //   5: dup
    //   6: aload_1
    //   7: invokespecial 17	java/io/File:<init>	(Ljava/lang/String;)V
    //   10: astore_3
    //   11: aload_3
    //   12: invokevirtual 28	java/io/File:mkdirs	()Z
    //   15: pop
    //   16: new 163	java/util/zip/ZipFile
    //   19: dup
    //   20: new 14	java/io/File
    //   23: dup
    //   24: aload_0
    //   25: invokespecial 17	java/io/File:<init>	(Ljava/lang/String;)V
    //   28: iconst_1
    //   29: invokespecial 166	java/util/zip/ZipFile:<init>	(Ljava/io/File;I)V
    //   32: astore 7
    //   34: aload 7
    //   36: invokevirtual 170	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   39: astore 8
    //   41: aload 8
    //   43: invokeinterface 175 1 0
    //   48: ifeq +177 -> 225
    //   51: aload 8
    //   53: invokeinterface 178 1 0
    //   58: checkcast 108	java/util/zip/ZipEntry
    //   61: astore 9
    //   63: getstatic 184	java/lang/System:out	Ljava/io/PrintStream;
    //   66: new 44	java/lang/StringBuilder
    //   69: dup
    //   70: ldc 186
    //   72: invokespecial 187	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   75: aload 9
    //   77: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   80: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   83: invokevirtual 195	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   86: new 14	java/io/File
    //   89: dup
    //   90: aload_3
    //   91: aload 9
    //   93: invokevirtual 196	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   96: invokespecial 199	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   99: astore 10
    //   101: aload 10
    //   103: invokevirtual 21	java/io/File:getParentFile	()Ljava/io/File;
    //   106: invokevirtual 28	java/io/File:mkdirs	()Z
    //   109: pop
    //   110: aload 9
    //   112: invokevirtual 200	java/util/zip/ZipEntry:isDirectory	()Z
    //   115: ifne +138 -> 253
    //   118: new 98	java/io/BufferedInputStream
    //   121: dup
    //   122: aload 7
    //   124: aload 9
    //   126: invokevirtual 204	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   129: invokespecial 207	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   132: astore 12
    //   134: sipush 4096
    //   137: newarray byte
    //   139: astore 14
    //   141: new 134	java/io/BufferedOutputStream
    //   144: dup
    //   145: new 136	java/io/FileOutputStream
    //   148: dup
    //   149: aload 10
    //   151: invokespecial 137	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   154: sipush 4096
    //   157: invokespecial 140	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   160: astore 15
    //   162: aload 12
    //   164: aload 14
    //   166: iconst_0
    //   167: sipush 4096
    //   170: invokevirtual 210	java/io/BufferedInputStream:read	([BII)I
    //   173: istore 16
    //   175: iload 16
    //   177: iconst_m1
    //   178: if_icmpeq +27 -> 205
    //   181: aload 15
    //   183: aload 14
    //   185: iconst_0
    //   186: iload 16
    //   188: invokevirtual 211	java/io/BufferedOutputStream:write	([BII)V
    //   191: goto -29 -> 162
    //   194: astore 13
    //   196: aload 12
    //   198: astore_2
    //   199: aload_2
    //   200: invokestatic 217	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   203: iconst_0
    //   204: ireturn
    //   205: aload 15
    //   207: invokevirtual 218	java/io/BufferedOutputStream:flush	()V
    //   210: aload 15
    //   212: invokevirtual 219	java/io/BufferedOutputStream:close	()V
    //   215: aload 12
    //   217: astore 17
    //   219: aload 17
    //   221: astore_2
    //   222: goto -181 -> 41
    //   225: aload_2
    //   226: invokestatic 217	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   229: iconst_1
    //   230: ireturn
    //   231: astore 5
    //   233: aload_2
    //   234: invokestatic 217	com/tencent/mm/sdk/platformtools/ch:c	(Ljava/io/Closeable;)V
    //   237: aload 5
    //   239: athrow
    //   240: astore 5
    //   242: aload 12
    //   244: astore_2
    //   245: goto -12 -> 233
    //   248: astore 4
    //   250: goto -51 -> 199
    //   253: aload_2
    //   254: astore 17
    //   256: goto -37 -> 219
    //
    // Exception table:
    //   from	to	target	type
    //   134	162	194	java/lang/Exception
    //   162	175	194	java/lang/Exception
    //   181	191	194	java/lang/Exception
    //   205	215	194	java/lang/Exception
    //   2	41	231	finally
    //   41	134	231	finally
    //   134	162	240	finally
    //   162	175	240	finally
    //   181	191	240	finally
    //   205	215	240	finally
    //   2	41	248	java/lang/Exception
    //   41	134	248	java/lang/Exception
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.l
 * JD-Core Version:    0.6.2
 */
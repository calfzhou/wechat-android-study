package com.tencent.mm.sdk.platformtools;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class bz
{
  static String[] iFA = { "vfat", "exfat", "fuse", "sdcardfs" };
  static String[] iFB = { "/mnt/secure", "/mnt/asec", "/mnt/obb", "/dev/mapper" };
  static String[] iFC = { "/dev/block/vold" };
  static String[] iFz = { "sysfs", "rootfs", "binfmt_misc", "anon_inodefs", "bdev", "proc", "cgroup", "tmpfs", "debugfs", "sockfs", "pipefs", "rpc_pipefs", "devpts", "ramfs", "fuseblk", "fusectl", "selinuxfs" };

  private static boolean a(ca paramca)
  {
    File localFile = new File(paramca.iFE, "test_writable");
    try
    {
      localFile.createNewFile();
      boolean bool2 = localFile.delete();
      bool1 = bool2;
      paramca.iFK = bool1;
      return bool1;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        z.e("!32@/B4Tb64lLpLmvsbzxdAwJ5x8Efuh277F", "createNewFile: " + localIOException.getMessage() + " dir: " + paramca.iFE);
        boolean bool1 = false;
      }
    }
  }

  public static ArrayList aNA()
  {
    ArrayList localArrayList1 = aNz();
    int i = localArrayList1.size();
    List localList1 = Arrays.asList(iFA);
    List localList2 = Arrays.asList(iFB);
    List localList3 = Arrays.asList(iFC);
    int j = i - 1;
    if (j >= 0)
    {
      ca localca9 = (ca)localArrayList1.get(j);
      if (!localList1.contains(localca9.iFF))
      {
        localArrayList1.remove(j);
        z.d("!32@/B4Tb64lLpLmvsbzxdAwJ5x8Efuh277F", "Remove with filesystem mismatch: " + localca9.iFF);
      }
      while (true)
      {
        j--;
        break;
        Iterator localIterator2 = localList2.iterator();
        boolean bool1 = false;
        while (localIterator2.hasNext())
        {
          String str3 = (String)localIterator2.next();
          bool1 |= localca9.iFE.startsWith(str3);
        }
        if (bool1)
        {
          localArrayList1.remove(j);
          z.d("!32@/B4Tb64lLpLmvsbzxdAwJ5x8Efuh277F", "Remove with bad mount dir1: " + localca9.iFE);
        }
        else if ((localca9.iFF.equals("fuse")) || (localca9.iFF.equals("sdcardfs")))
        {
          if (localca9.iFD.startsWith("/data/"))
          {
            localArrayList1.remove(j);
            z.d("!32@/B4Tb64lLpLmvsbzxdAwJ5x8Efuh277F", "Remove with bad mount dir2: " + localca9.iFD);
          }
        }
        else if ((!localca9.iFF.equals("fuse")) && (!localca9.iFF.equals("sdcardfs")))
        {
          Iterator localIterator3 = localList3.iterator();
          boolean bool2 = false;
          while (localIterator3.hasNext())
          {
            String str2 = (String)localIterator3.next();
            bool2 |= localca9.iFD.startsWith(str2);
          }
          if (!bool2)
          {
            localArrayList1.remove(j);
            z.d("!32@/B4Tb64lLpLmvsbzxdAwJ5x8Efuh277F", "Remove with bad device name: " + localca9.iFD);
          }
        }
      }
    }
    String str1 = Environment.getExternalStorageDirectory().getPath();
    int k = -1 + localArrayList1.size();
    if (k >= 0)
    {
      ca localca8 = (ca)localArrayList1.get(k);
      if (localca8.iFE.equals(str1))
      {
        localArrayList1.remove(k);
        localArrayList1.add(0, localca8);
      }
    }
    for (int m = 1; ; m = 0)
    {
      if (m == 0)
      {
        ca localca1 = new ca();
        localca1.iFE = str1;
        localca1.iFF = "unknown";
        localca1.iFD = "unknown";
        localArrayList1.add(0, localca1);
      }
      int n = -1 + localArrayList1.size();
      while (true)
        if (n >= 0)
        {
          ca localca7 = (ca)localArrayList1.get(n);
          File localFile = new File(localca7.iFE);
          if ((!localFile.exists()) || (!localFile.isDirectory()))
          {
            z.d("!32@/B4Tb64lLpLmvsbzxdAwJ5x8Efuh277F", "Directory verify failed: " + localca7);
            localArrayList1.remove(n);
          }
          n--;
          continue;
          k--;
          break;
        }
      for (int i1 = -1 + localArrayList1.size(); i1 >= 0; i1--)
      {
        ca localca6 = (ca)localArrayList1.get(i1);
        if (!a(localca6))
        {
          z.d("!32@/B4Tb64lLpLmvsbzxdAwJ5x8Efuh277F", "Directory testPermissionForStatMountParse failed: " + localca6);
          localArrayList1.remove(i1);
        }
      }
      ArrayList localArrayList2 = new ArrayList();
      int i3;
      Object localObject1;
      label691: Object localObject2;
      if (!localArrayList1.isEmpty())
      {
        ca localca5 = (ca)localArrayList1.remove(0);
        i3 = -1 + localArrayList1.size();
        localObject1 = localca5;
        if (i3 >= 0)
        {
          localObject2 = (ca)localArrayList1.get(i3);
          if (!((ca)localObject1).iFD.equals(((ca)localObject2).iFD))
            break label1033;
          localArrayList1.remove(i3);
          z.d("!32@/B4Tb64lLpLmvsbzxdAwJ5x8Efuh277F", "Duplicate with same DevName:" + ((ca)localObject1).iFD);
          if ((((ca)localObject1).iFK) || (!((ca)localObject2).iFK))
            break label1033;
          z.d("!32@/B4Tb64lLpLmvsbzxdAwJ5x8Efuh277F", "Keep the writable one, discard the unwritable one");
        }
      }
      while (true)
      {
        i3--;
        localObject1 = localObject2;
        break label691;
        localArrayList2.add(localObject1);
        break;
        Iterator localIterator1 = localArrayList2.iterator();
        while (localIterator1.hasNext())
        {
          ca localca4 = (ca)localIterator1.next();
          try
          {
            StatFs localStatFs = new StatFs(localca4.iFE);
            localca4.iFJ = localStatFs.getBlockSize();
            localca4.iFI = localStatFs.getAvailableBlocks();
            localca4.iFG = localStatFs.getBlockCount();
            localca4.iFH = localStatFs.getFreeBlocks();
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            z.e("!32@/B4Tb64lLpLmvsbzxdAwJ5x8Efuh277F", "statFsForStatMountParse", new Object[] { localIllegalArgumentException });
          }
        }
        localArrayList1.clear();
        while (!localArrayList2.isEmpty())
        {
          ca localca2 = (ca)localArrayList2.remove(0);
          localArrayList1.add(localca2);
          for (int i2 = -1 + localArrayList2.size(); i2 >= 0; i2--)
          {
            ca localca3 = (ca)localArrayList2.get(i2);
            if (localca2.equals(localca3))
            {
              z.d("!32@/B4Tb64lLpLmvsbzxdAwJ5x8Efuh277F", "Duplicate:" + localca2.toString() + "---" + localca3.toString());
              localArrayList2.remove(i2);
            }
          }
        }
        return localArrayList1;
        label1033: localObject2 = localObject1;
      }
    }
  }

  public static ArrayList aNB()
  {
    ArrayList localArrayList1 = aNA();
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = localArrayList1.iterator();
    while (localIterator.hasNext())
      localArrayList2.add(((ca)localIterator.next()).iFE);
    return localArrayList2;
  }

  // ERROR //
  private static ArrayList aNz()
  {
    // Byte code:
    //   0: new 138	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 234	java/util/ArrayList:<init>	()V
    //   7: astore_0
    //   8: new 293	java/io/BufferedReader
    //   11: dup
    //   12: new 295	java/io/FileReader
    //   15: dup
    //   16: ldc_w 297
    //   19: invokespecial 298	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   22: invokespecial 301	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   25: astore_1
    //   26: aload_1
    //   27: invokevirtual 304	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   30: astore 6
    //   32: aload 6
    //   34: ifnull +137 -> 171
    //   37: aload 6
    //   39: ldc_w 306
    //   42: invokevirtual 310	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   45: astore 7
    //   47: aload 7
    //   49: ifnull +10 -> 59
    //   52: aload 7
    //   54: arraylength
    //   55: iconst_3
    //   56: if_icmpge +58 -> 114
    //   59: ldc 104
    //   61: new 106	java/lang/StringBuilder
    //   64: dup
    //   65: ldc_w 312
    //   68: invokespecial 111	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   71: aload 6
    //   73: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   79: invokestatic 129	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   82: goto -56 -> 26
    //   85: astore 4
    //   87: ldc 104
    //   89: ldc_w 314
    //   92: iconst_1
    //   93: anewarray 4	java/lang/Object
    //   96: dup
    //   97: iconst_0
    //   98: aload 4
    //   100: aastore
    //   101: invokestatic 277	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   104: aload_1
    //   105: ifnull +7 -> 112
    //   108: aload_1
    //   109: invokevirtual 317	java/io/BufferedReader:close	()V
    //   112: aload_0
    //   113: areturn
    //   114: new 81	com/tencent/mm/sdk/platformtools/ca
    //   117: dup
    //   118: invokespecial 215	com/tencent/mm/sdk/platformtools/ca:<init>	()V
    //   121: astore 8
    //   123: aload 8
    //   125: aload 7
    //   127: iconst_0
    //   128: aaload
    //   129: putfield 194	com/tencent/mm/sdk/platformtools/ca:iFD	Ljava/lang/String;
    //   132: aload 8
    //   134: aload 7
    //   136: iconst_1
    //   137: aaload
    //   138: putfield 85	com/tencent/mm/sdk/platformtools/ca:iFE	Ljava/lang/String;
    //   141: aload 8
    //   143: aload 7
    //   145: iconst_2
    //   146: aaload
    //   147: putfield 155	com/tencent/mm/sdk/platformtools/ca:iFF	Ljava/lang/String;
    //   150: aload_0
    //   151: aload 8
    //   153: invokevirtual 243	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   156: pop
    //   157: goto -131 -> 26
    //   160: astore_2
    //   161: aload_1
    //   162: ifnull +7 -> 169
    //   165: aload_1
    //   166: invokevirtual 317	java/io/BufferedReader:close	()V
    //   169: aload_2
    //   170: athrow
    //   171: aload_1
    //   172: invokevirtual 317	java/io/BufferedReader:close	()V
    //   175: aload_0
    //   176: areturn
    //   177: astore 10
    //   179: aload_0
    //   180: areturn
    //   181: astore 5
    //   183: aload_0
    //   184: areturn
    //   185: astore_3
    //   186: goto -17 -> 169
    //   189: astore_2
    //   190: aconst_null
    //   191: astore_1
    //   192: goto -31 -> 161
    //   195: astore 4
    //   197: aconst_null
    //   198: astore_1
    //   199: goto -112 -> 87
    //
    // Exception table:
    //   from	to	target	type
    //   26	32	85	java/lang/Exception
    //   37	47	85	java/lang/Exception
    //   52	59	85	java/lang/Exception
    //   59	82	85	java/lang/Exception
    //   114	157	85	java/lang/Exception
    //   26	32	160	finally
    //   37	47	160	finally
    //   52	59	160	finally
    //   59	82	160	finally
    //   87	104	160	finally
    //   114	157	160	finally
    //   171	175	177	java/io/IOException
    //   108	112	181	java/io/IOException
    //   165	169	185	java/io/IOException
    //   8	26	189	finally
    //   8	26	195	java/lang/Exception
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bz
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.storage;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public final class bb
{
  private String ikg = "";
  private boolean ikh;
  List iki;
  List ikj;

  public bb(String paramString)
  {
    this.ikg = paramString;
    this.ikh = false;
    this.iki = aKw();
    this.ikj = new ArrayList();
  }

  private void a(cg paramcg, String paramString)
  {
    try
    {
      File localFile = new File(this.ikg + paramString);
      if (!localFile.exists())
        localFile.createNewFile();
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile, true);
      localFileOutputStream.write(paramcg.toString().getBytes());
      localFileOutputStream.close();
      return;
    }
    catch (Exception localException)
    {
      z.printErrStackTrace("!32@/B4Tb64lLpLLB1vaRZurDkqKcAnPawwc", localException, "", new Object[0]);
    }
  }

  private void aKv()
  {
    File localFile = new File(this.ikg + "op.tem");
    if ((!localFile.exists()) || (localFile.length() != 0L));
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(this.ikg + "op.log", true);
      FileInputStream localFileInputStream = new FileInputStream(localFile);
      byte[] arrayOfByte = new byte[(int)localFile.length()];
      localFileInputStream.read(arrayOfByte);
      localFileOutputStream.write(arrayOfByte);
      localFileInputStream.close();
      localFileOutputStream.close();
      localFile.delete();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        z.printErrStackTrace("!32@/B4Tb64lLpLLB1vaRZurDkqKcAnPawwc", localException, "", new Object[0]);
    }
  }

  private List aKw()
  {
    aKv();
    ArrayList localArrayList1 = new ArrayList();
    while (true)
    {
      int j;
      Object[] arrayOfObject;
      String[] arrayOfString2;
      try
      {
        z.i("!32@/B4Tb64lLpLLB1vaRZurDkqKcAnPawwc", "getOPListFromFiles, file=" + this.ikg + "op.log");
        File localFile = new File(this.ikg + "op.log");
        if (!localFile.exists())
          localFile.createNewFile();
        FileInputStream localFileInputStream = new FileInputStream(localFile);
        try
        {
          byte[] arrayOfByte = new byte[(int)localFile.length()];
          localFileInputStream.read(arrayOfByte);
          localFileInputStream.close();
          String str1 = new String(arrayOfByte);
          String[] arrayOfString1 = str1.split(";");
          int i = arrayOfString1.length;
          j = 0;
          if (j >= i)
            break label533;
          String str2 = arrayOfString1[j];
          z.i("!32@/B4Tb64lLpLLB1vaRZurDkqKcAnPawwc", "operation:[" + str2 + "], count=" + arrayOfString1.length);
          arrayOfObject = bc.zN(str2);
          if (arrayOfObject.length <= 1)
            z.d("!32@/B4Tb64lLpLLB1vaRZurDkqKcAnPawwc", "invalid operation, arg equals to 0");
        }
        catch (Exception localException2)
        {
          z.printErrStackTrace("!32@/B4Tb64lLpLLB1vaRZurDkqKcAnPawwc", localException2, "", new Object[0]);
          localFile.delete();
          return localArrayList1;
        }
        arrayOfString2 = bd.k(arrayOfObject);
        try
        {
          switch (ch.a(Integer.valueOf(arrayOfString2[0])))
          {
          default:
            z.e("!32@/B4Tb64lLpLLB1vaRZurDkqKcAnPawwc", "getOPListFromFiles: not found this opid");
          case 101:
          case 102:
          case 103:
          case 128:
          case 104:
          case 105:
          case 106:
          case 107:
          case 109:
          case 110:
          case 111:
          case 119:
          case 112:
          case 113:
          case 114:
          case 118:
          case 115:
          case 116:
          case 117:
          case 120:
          case 121:
          case 122:
          case 123:
          case 124:
          case 125:
          case 127:
          case 10000:
          }
        }
        catch (NumberFormatException localNumberFormatException)
        {
          z.e("!32@/B4Tb64lLpLLB1vaRZurDkqKcAnPawwc", "getOPListFromFiles failed, e=" + localNumberFormatException.getMessage());
        }
      }
      catch (Exception localException1)
      {
        z.printErrStackTrace("!32@/B4Tb64lLpLLB1vaRZurDkqKcAnPawwc", localException1, "", new Object[0]);
      }
      label533: return localArrayList1;
      if (arrayOfString2.length <= 19)
      {
        localArrayList1.add(new be(arrayOfString2[1], arrayOfString2[2], arrayOfString2[3], arrayOfString2[4], Integer.valueOf(arrayOfString2[5]).intValue(), Integer.valueOf(arrayOfString2[6]).intValue(), Integer.valueOf(arrayOfString2[7]).intValue(), arrayOfString2[9], arrayOfString2[10], arrayOfString2[11], Integer.valueOf(arrayOfString2[12]).intValue(), arrayOfString2[13], Integer.valueOf(arrayOfString2[14]).intValue(), Integer.valueOf(arrayOfString2[15]).intValue(), arrayOfString2[16], arrayOfString2[17], arrayOfString2[18], "", 0));
      }
      else
      {
        localArrayList1.add(new be(arrayOfString2[1], arrayOfString2[2], arrayOfString2[3], arrayOfString2[4], Integer.valueOf(arrayOfString2[5]).intValue(), Integer.valueOf(arrayOfString2[6]).intValue(), Integer.valueOf(arrayOfString2[7]).intValue(), arrayOfString2[9], arrayOfString2[10], arrayOfString2[11], Integer.valueOf(arrayOfString2[12]).intValue(), arrayOfString2[13], Integer.valueOf(arrayOfString2[14]).intValue(), Integer.valueOf(arrayOfString2[15]).intValue(), arrayOfString2[16], arrayOfString2[17], arrayOfString2[18], arrayOfString2[19], Integer.valueOf(arrayOfString2[20]).intValue()));
        break label2103;
        localArrayList1.add(new bi(arrayOfString2[1]));
        break label2103;
        localArrayList1.add(new bw(Integer.valueOf(arrayOfString2[1]).intValue(), Integer.valueOf(arrayOfString2[2]).intValue(), arrayOfString2[3], arrayOfString2[4]));
        break label2103;
        localArrayList1.add(new by(Integer.valueOf(arrayOfString2[1]).intValue()));
        break label2103;
        if (arrayOfString2.length <= 15)
        {
          localArrayList1.add(new ca(Integer.valueOf(arrayOfString2[1]).intValue(), arrayOfString2[2], arrayOfString2[3], Integer.valueOf(arrayOfString2[4]).intValue(), arrayOfString2[5], arrayOfString2[6], arrayOfString2[7], Integer.valueOf(arrayOfString2[8]).intValue(), Integer.valueOf(arrayOfString2[9]).intValue(), Integer.valueOf(arrayOfString2[10]).intValue(), arrayOfString2[11], arrayOfString2[12], arrayOfString2[13], Integer.valueOf(arrayOfString2[14]).intValue(), "", 0, "", 0));
        }
        else if (arrayOfString2.length <= 16)
        {
          localArrayList1.add(new ca(Integer.valueOf(arrayOfString2[1]).intValue(), arrayOfString2[2], arrayOfString2[3], Integer.valueOf(arrayOfString2[4]).intValue(), arrayOfString2[5], arrayOfString2[6], arrayOfString2[7], Integer.valueOf(arrayOfString2[8]).intValue(), Integer.valueOf(arrayOfString2[9]).intValue(), Integer.valueOf(arrayOfString2[10]).intValue(), arrayOfString2[11], arrayOfString2[12], arrayOfString2[13], Integer.valueOf(arrayOfString2[14]).intValue(), arrayOfString2[15], 0, "", 0));
        }
        else
        {
          localArrayList1.add(new ca(Integer.valueOf(arrayOfString2[1]).intValue(), arrayOfString2[2], arrayOfString2[3], Integer.valueOf(arrayOfString2[4]).intValue(), arrayOfString2[5], arrayOfString2[6], arrayOfString2[7], Integer.valueOf(arrayOfString2[8]).intValue(), Integer.valueOf(arrayOfString2[9]).intValue(), Integer.valueOf(arrayOfString2[10]).intValue(), arrayOfString2[11], arrayOfString2[12], arrayOfString2[13], Integer.valueOf(arrayOfString2[14]).intValue(), arrayOfString2[15], Integer.valueOf(arrayOfString2[16]).intValue(), arrayOfString2[17], Integer.valueOf(arrayOfString2[18]).intValue()));
          break label2103;
          localArrayList1.add(new bj(arrayOfString2[1], Integer.valueOf(arrayOfString2[2]).intValue()));
          break label2103;
          localArrayList1.add(new bh(arrayOfString2[1]));
          break label2103;
          localArrayList1.add(new bk(arrayOfString2[1], Integer.valueOf(arrayOfString2[2]).intValue()));
          break label2103;
          localArrayList1.add(new cb(arrayOfString2[1]));
          break label2103;
          localArrayList1.add(new bf(arrayOfString2[1]));
          break label2103;
          localArrayList1.add(new bx(arrayOfString2[1], Integer.valueOf(arrayOfString2[2]).intValue()));
          break label2103;
          localArrayList1.add(new bv(Boolean.valueOf(arrayOfString2[1]).booleanValue(), Integer.valueOf(arrayOfString2[2]).intValue(), Integer.valueOf(arrayOfString2[3]).intValue()));
          break label2103;
          localArrayList1.add(new bs(arrayOfString2[1], arrayOfString2[2], arrayOfString2[3], arrayOfString2[4], Integer.valueOf(arrayOfString2[5]).intValue(), arrayOfString2[6], arrayOfString2[7], arrayOfString2[8], Integer.valueOf(arrayOfString2[9]).intValue()));
          break label2103;
          localArrayList1.add(new cd(arrayOfString2[1], arrayOfString2[2]));
          break label2103;
          localArrayList1.add(new bt(arrayOfString2[1], Integer.valueOf(arrayOfString2[2]).intValue()));
          break label2103;
          localArrayList1.add(new bu(arrayOfString2[1], arrayOfString2[2]));
          break label2103;
          localArrayList1.add(new bl(arrayOfString2[1], arrayOfString2[2]));
          break label2103;
          localArrayList1.add(new bn(Integer.valueOf(arrayOfString2[1]).intValue(), Integer.valueOf(arrayOfString2[2]).intValue()));
          break label2103;
          localArrayList1.add(new cf(Integer.valueOf(arrayOfString2[1]).intValue()));
          break label2103;
          localArrayList1.add(new bm(arrayOfString2[1], Integer.valueOf(arrayOfString2[2]).intValue()));
          break label2103;
          localArrayList1.add(new bz(Integer.valueOf(arrayOfString2[1]).intValue(), arrayOfString2[2], arrayOfString2[3]));
          break label2103;
          localArrayList1.add(new cc(Integer.valueOf(arrayOfString2[1]).intValue(), arrayOfString2[2]));
          break label2103;
          String[] arrayOfString3 = arrayOfString2[1].split(";");
          ArrayList localArrayList2 = new ArrayList();
          int k = arrayOfString3.length;
          for (int m = 0; m < k; m++)
          {
            String str3 = arrayOfString3[m];
            bq localbq = new bq();
            localbq.zO(str3);
            localArrayList2.add(localbq);
          }
          localArrayList1.add(new bp(localArrayList2));
          break label2103;
          localArrayList1.add(new ce(Integer.valueOf(arrayOfString2[1]).intValue(), arrayOfString2[2]));
          break label2103;
          localArrayList1.add(new bo(arrayOfString2[1], Integer.valueOf(arrayOfString2[2]).intValue()));
          break label2103;
          localArrayList1.add(new br(Integer.valueOf(arrayOfString2[1]).intValue(), Integer.valueOf(arrayOfString2[2]).intValue()));
          break label2103;
          localArrayList1.add(new bg(Integer.valueOf(arrayOfString2[1]).intValue(), (byte[])arrayOfObject[2]));
        }
      }
      label2103: j++;
    }
  }

  public final void a(cg paramcg)
  {
    if (!this.ikh)
    {
      a(paramcg, "op.log");
      this.iki.add(paramcg);
      return;
    }
    a(paramcg, "op.tem");
    this.ikj.add(paramcg);
  }

  public final List aKu()
  {
    if (this.ikh)
    {
      localArrayList = new ArrayList();
      return localArrayList;
    }
    this.ikh = true;
    int i = this.iki.size();
    ArrayList localArrayList = new ArrayList();
    int j = 0;
    while ((j < i) && (this.iki != null))
      try
      {
        localArrayList.add(this.iki.get(j));
        j++;
      }
      catch (Exception localException)
      {
        while (true)
          z.printErrStackTrace("!32@/B4Tb64lLpLLB1vaRZurDkqKcAnPawwc", localException, "", new Object[0]);
      }
  }

  public final void eh(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.iki = this.ikj;
      this.ikj = new ArrayList();
      File localFile1 = new File(this.ikg + "op.log");
      if (localFile1.exists())
        localFile1.delete();
      File localFile2 = new File(this.ikg + "op.tem");
      if (localFile2.exists())
        localFile2.renameTo(new File(this.ikg + "op.log"));
    }
    while (true)
    {
      this.ikh = false;
      return;
      this.iki.addAll(this.ikj);
      this.ikj.clear();
      aKv();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bb
 * JD-Core Version:    0.6.2
 */
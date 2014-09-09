package com.tencent.mm.compatible.c;

import com.tencent.mm.sdk.platformtools.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public final class t
{
  private RandomAccessFile dNt;
  private u dNu;
  private ArrayList dNv;

  private void nd()
  {
    if (this.dNt != null)
    {
      int i;
      String str;
      String[] arrayOfString;
      try
      {
        this.dNt.seek(0L);
        i = -1;
        str = this.dNt.readLine();
        if ((str == null) || (str.length() <= 0))
          break label194;
        arrayOfString = str.split("[ ]+");
        if (arrayOfString[0].indexOf("cpu") == -1)
          break label210;
        if (i == -1)
        {
          if (this.dNu == null)
            this.dNu = new u(this);
          this.dNu.c(arrayOfString);
        }
        else
        {
          if (this.dNv == null)
            this.dNv = new ArrayList();
          if (i < this.dNv.size())
            ((u)this.dNv.get(i)).c(arrayOfString);
        }
      }
      catch (IOException localIOException)
      {
        z.e("!32@l31zBa06gKv3g5PVsxQDw6xSkq6dzCWS", "Ops: " + localIOException);
        return;
      }
      u localu = new u(this);
      localu.c(arrayOfString);
      this.dNv.add(localu);
      break label210;
      label194: z.e("!32@l31zBa06gKv3g5PVsxQDw6xSkq6dzCWS", "unable to get cpu line");
      label210: 
      do
      {
        i = j;
        break;
        int j = i + 1;
      }
      while (str != null);
    }
  }

  private void update()
  {
    try
    {
      this.dNt = new RandomAccessFile("/proc/stat", "r");
      nd();
      if (this.dNt != null)
        this.dNt.close();
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      this.dNt = null;
      z.e("!32@l31zBa06gKv3g5PVsxQDw6xSkq6dzCWS", "cannot open /proc/stat: " + localFileNotFoundException);
      return;
    }
    catch (IOException localIOException)
    {
      z.e("!32@l31zBa06gKv3g5PVsxQDw6xSkq6dzCWS", "cannot close /proc/stat: " + localIOException);
    }
  }

  public final int ne()
  {
    update();
    u localu = this.dNu;
    int i = 0;
    if (localu != null)
      i = u.a(this.dNu);
    return i;
  }

  public final String toString()
  {
    update();
    StringBuffer localStringBuffer = new StringBuffer();
    if (this.dNu != null)
    {
      localStringBuffer.append("Cpu Total : ");
      localStringBuffer.append(u.a(this.dNu));
      localStringBuffer.append("%");
    }
    if (this.dNv != null)
      for (int i = 0; i < this.dNv.size(); i++)
      {
        u localu = (u)this.dNv.get(i);
        localStringBuffer.append(" Cpu Core(" + i + ") : ");
        localStringBuffer.append(u.a(localu));
        localStringBuffer.append("%");
        u.a(localu);
      }
    return localStringBuffer.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.c.t
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.y;

import android.graphics.Bitmap;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ar
  implements g
{
  private List dyL = new LinkedList();
  private aw dyM = null;
  private boolean dyN = false;

  private static String gU(String paramString)
  {
    String str;
    try
    {
      str = URLEncoder.encode(paramString, "UTF-8");
      if (ch.jb(str))
      {
        z.e("!44@/B4Tb64lLpJDZix/OvlTO00TbpgnCurrdusxe1vELWg=", "encode result is null: " + paramString);
        return null;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      z.e("!44@/B4Tb64lLpJDZix/OvlTO00TbpgnCurrdusxe1vELWg=", "try encode unsupport character: " + paramString);
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(h.dOK);
    int i = str.length();
    int j = 0;
    while (j < i)
    {
      localStringBuilder.append('/');
      if (j + 20 < i)
      {
        localStringBuilder.append(str.substring(j, j + 20));
        j += 20;
      }
      else
      {
        localStringBuilder.append(str.substring(j, i));
        j = i;
      }
    }
    return localStringBuilder.toString();
  }

  private void yl()
  {
    while (true)
    {
      if ((this.dyM != null) || (this.dyL.size() == 0))
      {
        z.d("!44@/B4Tb64lLpJDZix/OvlTO00TbpgnCurrdusxe1vELWg=", "task is downing or no more task");
        return;
      }
      this.dyM = ((aw)this.dyL.get(0));
      this.dyL.remove(0);
      this.dyN = false;
      ap.yf();
      Bitmap localBitmap = d.gK(this.dyM.url);
      if (localBitmap == null)
        break;
      z.d("!44@/B4Tb64lLpJDZix/OvlTO00TbpgnCurrdusxe1vELWg=", "find bitmap in cache of " + this.dyM.url);
      if (!this.dyN)
      {
        au localau = this.dyM.dyP;
        localau.d(localBitmap);
      }
      this.dyM = null;
    }
    as localas = new as(this);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.dyM.url;
    localas.execute(arrayOfString);
  }

  public final void a(String paramString, au paramau)
  {
    if ((ch.jb(paramString)) || (paramau == null))
    {
      z.e("!44@/B4Tb64lLpJDZix/OvlTO00TbpgnCurrdusxe1vELWg=", "url is null or nil, or callback is null");
      return;
    }
    if ((this.dyM != null) && (this.dyM.url.equals(paramString)) && (this.dyM.dyP == paramau))
    {
      z.e("!44@/B4Tb64lLpJDZix/OvlTO00TbpgnCurrdusxe1vELWg=", "url and callback is loading");
      return;
    }
    Iterator localIterator = this.dyL.iterator();
    while (localIterator.hasNext())
    {
      aw localaw = (aw)localIterator.next();
      if ((localaw.url.equals(paramString)) && (localaw.dyP == paramau))
      {
        z.e("!44@/B4Tb64lLpJDZix/OvlTO00TbpgnCurrdusxe1vELWg=", "url and callback is loading");
        return;
      }
    }
    this.dyL.add(new aw(paramString, paramau));
    yl();
  }

  public final void c(Bitmap paramBitmap)
  {
    if (paramBitmap == null)
    {
      z.e("!44@/B4Tb64lLpJDZix/OvlTO00TbpgnCurrdusxe1vELWg=", "load from url failed: " + this.dyM.url);
      this.dyM = null;
      yl();
      return;
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.dyM.url;
    z.i("!44@/B4Tb64lLpJDZix/OvlTO00TbpgnCurrdusxe1vELWg=", "load from %s successed", arrayOfObject);
    at localat = new at(this);
    av[] arrayOfav = new av[1];
    arrayOfav[0] = new av(gU(this.dyM.url), paramBitmap);
    localat.execute(arrayOfav);
    if (!this.dyN)
    {
      ap.yf();
      d.g(this.dyM.url, paramBitmap);
      au localau = this.dyM.dyP;
      localau.d(paramBitmap);
    }
    this.dyM = null;
    yl();
  }

  public final void detach()
  {
    z.i("!44@/B4Tb64lLpJDZix/OvlTO00TbpgnCurrdusxe1vELWg=", "detach");
    this.dyL.clear();
    this.dyN = true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.ar
 * JD-Core Version:    0.6.2
 */
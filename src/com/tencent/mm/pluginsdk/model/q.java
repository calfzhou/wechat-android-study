package com.tencent.mm.pluginsdk.model;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Looper;
import android.widget.Toast;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.n.ab;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.e;
import junit.framework.Assert;

public final class q
  implements m
{
  private Context context;
  private ProgressDialog esI;
  private Runnable hun = null;
  private Runnable huo = null;
  private String path;

  public q(Context paramContext, String paramString)
  {
    this.context = paramContext;
    this.path = paramString;
    this.esI = null;
    bg.qX().a(157, this);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpIUGQfqwvb6VmX5eqzMRsqd7YUJg2KmvDA=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    bg.qX().b(157, this);
    if ((this.esI != null) && (this.esI.isShowing()) && ((this.context instanceof Activity)) && (!((Activity)this.context).isFinishing()));
    label267: 
    while (true)
    {
      try
      {
        this.esI.dismiss();
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          Toast.makeText(this.context, n.cht, 0).show();
          if (this.hun != null)
            new cm(Looper.getMainLooper()).post(this.hun);
          return;
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        z.e("!44@/B4Tb64lLpIUGQfqwvb6VmX5eqzMRsqd7YUJg2KmvDA=", "dismiss dialog err" + localIllegalArgumentException.getMessage());
        continue;
        if (this.huo != null)
          new cm(Looper.getMainLooper()).post(this.huo);
        switch (paramInt1)
        {
        default:
        case 4:
        }
      }
      for (int i = 0; ; i = 1)
      {
        if (i != 0)
          break label267;
        Toast.makeText(this.context, n.chs, 0).show();
        return;
        if (paramInt2 != -4)
          break;
        Toast.makeText(this.context, n.bCm, 0).show();
      }
    }
  }

  public final boolean a(int paramInt, Runnable paramRunnable)
  {
    boolean bool1;
    Object[] arrayOfObject;
    if ((this.context != null) && (this.path != null) && (this.path.length() > 0))
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      this.hun = paramRunnable;
      Context localContext = this.context;
      this.context.getString(n.buo);
      this.esI = e.a(localContext, this.context.getString(n.chu), true, null);
      ab localab = new ab(paramInt, this.path);
      bg.qX().d(localab);
      arrayOfObject = new Object[1];
      if (paramRunnable != null)
        break label134;
    }
    label134: for (boolean bool2 = true; ; bool2 = false)
    {
      arrayOfObject[0] = Boolean.valueOf(bool2);
      z.i("!44@/B4Tb64lLpIUGQfqwvb6VmX5eqzMRsqd7YUJg2KmvDA=", "post is null ? %B", arrayOfObject);
      return true;
      bool1 = false;
      break;
    }
  }

  public final boolean a(Runnable paramRunnable1, Runnable paramRunnable2)
  {
    if ((this.context != null) && (this.path != null) && (this.path.length() > 0));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.hun = paramRunnable1;
      this.huo = paramRunnable2;
      ab localab = new ab(1, this.path);
      bg.qX().d(localab);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(false);
      z.i("!44@/B4Tb64lLpIUGQfqwvb6VmX5eqzMRsqd7YUJg2KmvDA=", "post is null ? %B", arrayOfObject);
      return true;
    }
  }

  public final boolean mh(int paramInt)
  {
    return a(paramInt, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.q
 * JD-Core Version:    0.6.2
 */
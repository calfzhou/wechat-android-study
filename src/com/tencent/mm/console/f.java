package com.tencent.mm.console;

import android.app.ProgressDialog;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

final class f
  implements Runnable
{
  f(File paramFile, String paramString, ProgressDialog paramProgressDialog)
  {
  }

  public final void run()
  {
    try
    {
      Thread.sleep(500L);
      label6: String str1 = bg.qW().pt() + this.dPq.getName().replace(".db", "temp.db");
      z.i("!44@/B4Tb64lLpJLD/TSzHAWHSAf/GG2c9mYEhKZ1EHpY7c=", "temp db path is %s", new Object[] { str1 });
      b.a(new File(str1), this.dPq);
      this.dPq.delete();
      String str2 = bg.qW().pt() + "sqlTemp.sql";
      ArrayList localArrayList = new ArrayList();
      localArrayList.addAll(Arrays.asList(new String[] { "getcontactinfo", "contact", "contact_ext", "ContactCmdBuf", "rcontact", "img_flag", "userinfo" }));
      b.ot();
      long l1 = System.currentTimeMillis();
      boolean bool = bg.qW().oO().a(str1, this.dPp, str2, localArrayList, new g(this));
      long l2 = System.currentTimeMillis() - l1;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(b.nB());
      arrayOfObject[1] = Long.valueOf(l2);
      z.i("!44@/B4Tb64lLpJLD/TSzHAWHSAf/GG2c9mYEhKZ1EHpY7c=", "execute %d sql and last %d", arrayOfObject);
      bg.qQ().aHq();
      am.h(new h(this, bool, l2));
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label6;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.f
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.contact;

import android.app.ProgressDialog;
import android.content.Intent;
import com.tencent.mm.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.ag;
import java.util.ArrayList;
import java.util.Iterator;

final class ez
  implements Runnable
{
  ez(SelectContactUI paramSelectContactUI, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    String str1 = x.pG();
    Iterator localIterator = this.jCa.iterator();
    int i = 0;
    String str2 = null;
    if (localIterator.hasNext())
    {
      String str3 = (String)localIterator.next();
      z.d("!44@/B4Tb64lLpJQGo7VtHU/gqcqIvwmEmrSejrKUoictEE=", "toSend, %s", new Object[] { str3 });
      if (y.dc(str3));
      for (int j = 1; ; j = 0)
      {
        int k = i + j;
        ag localag = new ag(4, str1, str3, SelectContactUI.Q(this.jBX), 0, null, 0, "", str2, true, h.Ti);
        bg.qX().d(localag);
        if (localag.yc() != null)
          str2 = localag.yc().kp();
        i = k;
        break;
      }
    }
    SelectContactUI.d(this.jBX).dismiss();
    Intent localIntent = new Intent();
    localIntent.putStringArrayListExtra("Select_Contact", this.jCa);
    this.jBX.setResult(-1, localIntent);
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(1);
    arrayOfObject[1] = Integer.valueOf(this.jCa.size() - i);
    arrayOfObject[2] = Integer.valueOf(i);
    localn.d(11048, arrayOfObject);
    this.jBX.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ez
 * JD-Core Version:    0.6.2
 */
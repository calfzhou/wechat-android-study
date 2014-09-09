package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.app.ProgressDialog;
import com.tencent.mm.compatible.g.l;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.e;

final class bp
  implements Runnable
{
  bp(aj paramaj)
  {
  }

  public final void run()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(aj.x(this.jGZ).nM());
    if (aj.y(this.jGZ) == null);
    for (int i = -2; ; i = aj.y(this.jGZ).hashCode())
    {
      arrayOfObject[1] = Integer.valueOf(i);
      z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "dkinit showProgressDlg t:%d initScene:%d", arrayOfObject);
      if (aj.y(this.jGZ) != null)
      {
        if ((aj.w(this.jGZ) != null) && (aj.w(this.jGZ).isShowing()))
          aj.w(this.jGZ).dismiss();
        aj localaj = this.jGZ;
        Activity localActivity = this.jGZ.agh();
        this.jGZ.getString(n.buo);
        aj.a(localaj, e.a(localActivity, this.jGZ.getString(n.btG), false, new bq(this)));
        bg.qQ().aHo();
      }
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.bp
 * JD-Core Version:    0.6.2
 */
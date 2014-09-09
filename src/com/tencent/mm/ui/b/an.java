package com.tencent.mm.ui.b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import com.tencent.mm.sdk.platformtools.bc;
import java.lang.ref.WeakReference;

final class an
  implements DialogInterface.OnClickListener
{
  an(am paramam)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      ag.m(this.iXc.iXb).setVisibility(8);
      ag.n(this.iXc.iXb);
      bc.y((Context)ag.o(this.iXc.iXb).get(), this.iXc.eaJ);
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.an
 * JD-Core Version:    0.6.2
 */
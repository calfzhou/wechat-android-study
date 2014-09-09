package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.modelsimple.f;

final class dn
  implements DialogInterface.OnClickListener
{
  dn(Intent paramIntent, Runnable paramRunnable, MMActivity paramMMActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.iMS != null)
    {
      if (this.iMT != null)
        this.iMT.run();
      f.H(this.cHe);
      this.cHe.finish();
      this.cHe.startActivity(this.iMS);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.dn
 * JD-Core Version:    0.6.2
 */
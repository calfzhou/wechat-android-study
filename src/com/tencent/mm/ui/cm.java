package com.tencent.mm.ui;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;

final class cm
  implements View.OnClickListener
{
  cm(cg paramcg, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.esU != null)
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setData(Uri.parse(this.esU));
      cg.c(this.iMo).startActivity(localIntent);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.cm
 * JD-Core Version:    0.6.2
 */
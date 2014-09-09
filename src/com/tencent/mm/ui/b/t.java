package com.tencent.mm.ui.b;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.bt;
import com.tencent.mm.modelfriend.ac;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.bindgooglecontact.BindGoogleContactIntroUI;
import com.tencent.mm.ui.bindgooglecontact.GoogleFriendUI;
import java.lang.ref.WeakReference;

final class t
  implements View.OnClickListener
{
  t(s params, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(View paramView)
  {
    bt.rn().y(this.eaJ, this.iWN);
    Context localContext = (Context)s.a(this.iWO).get();
    if (localContext != null)
    {
      if (!ac.wi())
      {
        Intent localIntent1 = new Intent(localContext, BindGoogleContactIntroUI.class);
        localIntent1.putExtra("enter_scene", 1);
        localIntent1.putExtra("KEnterFromBanner", true);
        MMWizardActivity.j(localContext, localIntent1);
      }
      Intent localIntent2 = new Intent(localContext, GoogleFriendUI.class);
      localIntent2.putExtra("enter_scene", 1);
      localIntent2.putExtra("KEnterFromBanner", true);
      localContext.startActivity(localIntent2);
      n localn = n.fTF;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(6);
      arrayOfObject[1] = Integer.valueOf(1);
      localn.d(11002, arrayOfObject);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.t
 * JD-Core Version:    0.6.2
 */
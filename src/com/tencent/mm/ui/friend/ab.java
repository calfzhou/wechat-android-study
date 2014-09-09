package com.tencent.mm.ui.friend;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.bindmobile.MobileFriendUI;

final class ab
  implements View.OnClickListener
{
  ab(FMessageConversationUI paramFMessageConversationUI)
  {
  }

  public final void onClick(View paramView)
  {
    if (!ch.jb((String)bg.qW().oQ().get(6)))
    {
      Intent localIntent = new Intent(this.jIq, MobileFriendUI.class);
      this.jIq.startActivity(localIntent);
      return;
    }
    MMWizardActivity.j(this.jIq, new Intent(this.jIq, BindMContactIntroUI.class));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.ab
 * JD-Core Version:    0.6.2
 */
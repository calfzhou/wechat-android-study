package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.am;
import java.util.List;

final class ea
  implements MenuItem.OnMenuItemClickListener
{
  ea(SelectContactUI paramSelectContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Intent localIntent = new Intent();
    List localList = SelectContactUI.g(this.jBX).aXy();
    if (localList.size() == 0)
    {
      this.jBX.setResult(0);
      this.jBX.finish();
    }
    do
    {
      return true;
      if (SelectContactUI.q(this.jBX))
      {
        localIntent.putExtra("enter_room_username", ap.a(localList, ","));
        a.b(this.jBX, "talkroom", ".ui.TalkRoomUI", localIntent);
        this.jBX.finish();
        return true;
      }
      localIntent.putExtra("Select_Contact", ap.a(localList, ","));
      this.jBX.setResult(-1, localIntent);
      this.jBX.finish();
    }
    while (this.jBX.getIntent().getBooleanExtra("stay_in_wechat", true));
    am.b(new eb(this), 80L);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ea
 * JD-Core Version:    0.6.2
 */
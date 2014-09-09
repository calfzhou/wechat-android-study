package com.tencent.mm.ui.contact.profile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.chatting.ChattingUI;

final class cv
  implements View.OnClickListener
{
  cv(cf paramcf)
  {
  }

  public final void onClick(View paramView)
  {
    if (NormalUserFooterPreference.d(this.jEy.jEw))
    {
      cf localcf2 = this.jEy;
      String str = NormalUserFooterPreference.a(localcf2.jEw).getUsername();
      Intent localIntent2 = new Intent(localcf2.jEw.getContext(), ChattingUI.class);
      localIntent2.addFlags(67108864);
      if (NormalUserFooterPreference.m(localcf2.jEw))
      {
        localIntent2.putExtra("Chat_User", str);
        localIntent2.putExtra("Chat_Mode", 1);
        ((Activity)localcf2.jEw.getContext()).setResult(-1, localIntent2);
      }
      while (true)
      {
        ((Activity)localcf2.jEw.getContext()).finish();
        return;
        localIntent2.putExtra("Chat_User", str);
        localIntent2.putExtra("Chat_Mode", 1);
        localcf2.jEw.getContext().startActivity(localIntent2);
      }
    }
    cf localcf1 = this.jEy;
    Intent localIntent1 = new Intent(localcf1.jEw.getContext(), ChattingUI.class);
    localIntent1.addFlags(67108864);
    if (NormalUserFooterPreference.m(localcf1.jEw))
    {
      localIntent1.putExtra("Chat_User", NormalUserFooterPreference.a(localcf1.jEw).getUsername());
      localIntent1.putExtra("Chat_Mode", 1);
      ((Activity)localcf1.jEw.getContext()).setResult(-1, localIntent1);
    }
    while (true)
    {
      ((Activity)localcf1.jEw.getContext()).finish();
      return;
      localIntent1.putExtra("Chat_User", NormalUserFooterPreference.a(localcf1.jEw).getUsername());
      localIntent1.putExtra("Chat_Mode", 1);
      localcf1.jEw.getContext().startActivity(localIntent1);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.cv
 * JD-Core Version:    0.6.2
 */
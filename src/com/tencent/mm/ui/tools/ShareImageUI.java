package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.List;

public class ShareImageUI extends MMActivity
{
  private String imagePath;
  private List jUK;

  protected final void DP()
  {
    oP(n.bSz);
    ListView localListView = (ListView)findViewById(i.aeA);
    gk localgk = new gk(this, this, this.jUK, (byte)0);
    localListView.setAdapter(localgk);
    localListView.setOnItemClickListener(new gg(this, localgk));
    int i = n.bTl;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(localgk.baS().size());
    a(0, getString(i, arrayOfObject), new gh(this, localgk));
    a(new gj(this, localgk));
  }

  protected final int getLayoutId()
  {
    return k.bgC;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jUK = getIntent().getStringArrayListExtra("Select_Contact");
    this.imagePath = getIntent().getStringExtra("intent_extra_image_path");
    DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShareImageUI
 * JD-Core Version:    0.6.2
 */
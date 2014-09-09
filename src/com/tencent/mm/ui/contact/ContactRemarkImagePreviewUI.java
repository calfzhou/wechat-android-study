package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.q;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.MMGestureGallery;

public class ContactRemarkImagePreviewUI extends MMActivity
{
  private MMGestureGallery ePa;
  private View jyF;
  private String jyG;
  private boolean jyH;
  private boolean jyI;
  private bi jyJ;
  private String username;

  private void fx(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("response_delete", true);
      setResult(-1, localIntent);
    }
    finish();
  }

  protected final void DP()
  {
    this.jyF = findViewById(i.aoJ);
    this.ePa = ((MMGestureGallery)findViewById(i.auH));
    oP(n.bSV);
    this.ePa.setVerticalFadingEdgeEnabled(false);
    this.ePa.setHorizontalFadingEdgeEnabled(false);
    q.J(this.ePa);
    this.jyJ = new bi(this);
    this.jyJ.setImagePath(this.jyG);
    this.ePa.setAdapter(this.jyJ);
    this.ePa.setOnItemClickListener(new bh(this));
    a(0, h.QL, new bd(this));
    a(new bg(this));
  }

  protected final int getLayoutId()
  {
    return k.bdJ;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.username = getIntent().getStringExtra("Contact_User");
    this.jyG = getIntent().getStringExtra("remark_image_path");
    this.jyH = getIntent().getBooleanExtra("view_temp_remark_image", false);
    this.jyI = getIntent().getBooleanExtra("view_only", false);
    if (ch.jb(this.username))
    {
      finish();
      return;
    }
    DP();
  }

  protected void onDestroy()
  {
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      fx(false);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    super.onPause();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI
 * JD-Core Version:    0.6.2
 */
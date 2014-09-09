package com.tencent.mm.ui.widget;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.mm.ar.e;
import com.tencent.mm.sdk.platformtools.z;

public class MMEditText extends EditText
{
  int iYC = 0;
  private InputConnection kaM;
  private b kaN;

  public MMEditText(Context paramContext)
  {
    super(paramContext);
  }

  public MMEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public MMEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void BO(String paramString)
  {
    int i = getSelectionStart();
    setText(com.tencent.mm.ar.b.b(getContext(), paramString, (int)getTextSize(), false));
    int j = getText().length() - paramString.length();
    if (j > 0)
    {
      int k = i + j;
      if (k <= getText().length())
        setSelection(k);
      return;
    }
    setSelection(i);
  }

  public final void DC(String paramString)
  {
    int i = e.h(getContext(), getText().toString(), getSelectionStart());
    int j = e.h(getContext(), getText().toString(), getSelectionEnd());
    StringBuffer localStringBuffer = new StringBuffer(getText());
    String str = localStringBuffer.substring(0, i) + paramString + localStringBuffer.substring(j, localStringBuffer.length());
    setText(com.tencent.mm.ar.b.a(getContext(), str, (int)getTextSize(), false));
    setSelection(i + paramString.length());
  }

  public final void b(b paramb)
  {
    this.kaN = paramb;
  }

  public final InputConnection bco()
  {
    return this.kaM;
  }

  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    this.kaM = super.onCreateInputConnection(paramEditorInfo);
    return this.kaM;
  }

  public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
  {
    Object[] arrayOfObject = new Object[1];
    boolean bool;
    if (this.kaN == null)
    {
      bool = true;
      arrayOfObject[0] = Boolean.valueOf(bool);
      z.v("!32@/B4Tb64lLpKIBwYy27eZfJEyh0MS+Du5", "on onKeyPreIme, listener null ? %B", arrayOfObject);
      if ((this.kaN == null) || (paramInt != 4))
        break label184;
      if ((paramKeyEvent.getAction() != 0) || (paramKeyEvent.getRepeatCount() != 0))
        break label90;
      z.v("!32@/B4Tb64lLpKIBwYy27eZfJEyh0MS+Du5", "on onKeyPreIme action down");
      KeyEvent.DispatcherState localDispatcherState2 = getKeyDispatcherState();
      if (localDispatcherState2 != null)
        localDispatcherState2.startTracking(paramKeyEvent, this);
    }
    label90: InputMethodManager localInputMethodManager;
    do
    {
      return true;
      bool = false;
      break;
      if (paramKeyEvent.getAction() != 1)
        break label184;
      z.v("!32@/B4Tb64lLpKIBwYy27eZfJEyh0MS+Du5", "on onKeyPreIme action up");
      KeyEvent.DispatcherState localDispatcherState1 = getKeyDispatcherState();
      if (localDispatcherState1 != null)
        localDispatcherState1.handleUpEvent(paramKeyEvent);
      if ((!paramKeyEvent.isTracking()) || (paramKeyEvent.isCanceled()))
        break label184;
      z.v("!32@/B4Tb64lLpKIBwYy27eZfJEyh0MS+Du5", "on onKeyPreIme action up is tracking");
      this.kaN.amX();
      localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
    }
    while (localInputMethodManager == null);
    localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
    return true;
    label184: return super.onKeyPreIme(paramInt, paramKeyEvent);
  }

  public boolean onTextContextMenuItem(int paramInt)
  {
    boolean bool = super.onTextContextMenuItem(paramInt);
    String str;
    if (paramInt == 16908322)
    {
      this.iYC = 0;
      str = getText().toString();
    }
    try
    {
      BO(str);
      return bool;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.iYC);
      z.e("!32@/B4Tb64lLpKIBwYy27eZfJEyh0MS+Du5", "!!MMEditText Exception %d", arrayOfObject);
      if (this.iYC < 3)
      {
        this.iYC = (1 + this.iYC);
        BO(" " + str);
        return bool;
      }
      throw localIndexOutOfBoundsException;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMEditText
 * JD-Core Version:    0.6.2
 */
package com.example.exchangedemo;

import java.text.DateFormat;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class SimpleExchangeAdapter extends BaseAdapter {

    private List<MessageViewModel> messageList;
    private Activity mActivity;
    private LayoutInflater inflater;

    public SimpleExchangeAdapter(Activity activity, List<MessageViewModel> messages) {
        messageList = messages;
        mActivity = activity;
        inflater = (LayoutInflater) mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return messageList.size();
    }

    @Override
    public MessageViewModel getItem(int arg0) {
        // TODO Auto-generated method stub
        return messageList.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return arg0;
    }

    @Override
    public View getView(int arg0, View arg1, ViewGroup arg2) {

        if (arg1 == null) {
            arg1 = inflater.inflate(R.layout.list_item, arg2, false);
        }

        TextView senderName = (TextView) arg1.findViewById(R.id.sender);
        TextView subject = (TextView) arg1.findViewById(R.id.subject);
        TextView sendOn = (TextView)arg1.findViewById(R.id.sendOn);
        MessageViewModel message = messageList.get(arg0);

        DateFormat dateTimeFormatter = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);

        sendOn.setText(dateTimeFormatter.format(message.getDateTimeSent()));
        senderName.setText(message.getSenderName());
        subject.setText(message.getSubject());

        return arg1;
    }

    public MessageViewModel getMessage(int position) {
        return messageList.get(position);
    }
}
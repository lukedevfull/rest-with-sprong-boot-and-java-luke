package br.com.lukedevfull.exeptions;

import java.util.Date;

public record ResponseExeptions(Date timestamp, String message, String details) {}

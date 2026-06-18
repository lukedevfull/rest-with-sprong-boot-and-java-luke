package br.com.lukedevfull.exceptions;

import java.util.Date;

public record ResponseExeptions(Date timestamp, String message, String details) {}
